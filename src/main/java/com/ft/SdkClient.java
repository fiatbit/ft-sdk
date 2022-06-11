package com.ft;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ft.domain.ApiHeaders;
import com.ft.response.BaseApiResponse;
import com.ft.util.AesUtil;
import com.ft.util.OkHttpUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class SdkClient {

    private static final String HOST = "http://sandbox.fiatbit.com";
    private static final String API_KEY = "qKbM3UAwrz8FnMBNFCewp2TlXtADrUAuKLL7P9Vxbj4IsErqV8gSFpnCGwNSg9xk";
    private static final String SECRET_KEY = "m31RS4DEVnAN70wUIIR9u1yb83ZzUYh41JU2MlBPEKtAkQ5t8ZcK0BexLvzHw6IW";

    static <T extends BaseApiResponse> T doRequest(String api, String json, Class<T> clazz) throws IOException {
        final Map<String, String> headers = createHeaders(api, json);
        final Response response = OkHttpUtil.post(HOST + api, json, headers);
        final String responseBody = OkHttpUtil.getResponseBody(response);
        log.info("{}", responseBody);
        final T object = JSON.parseObject(responseBody, clazz);
        log.info(JSON.toJSONString(object, SerializerFeature.PrettyFormat));
        return object;
    }

    static Map<String, String> createHeaders(String api, String json) {
        final String nonce = RandomStringUtils.randomAlphanumeric(10);
        final String timestamp = String.valueOf(System.currentTimeMillis());

        final String sign = sign(api, json, nonce, timestamp);

        final Map<String, String> headers = new HashMap<>();
        headers.put(ApiHeaders.API_KEY.getName(), API_KEY);
        headers.put(ApiHeaders.NONCE.getName(), nonce);
        headers.put(ApiHeaders.TIMESTAMP.getName(), timestamp);
        headers.put(ApiHeaders.SIGN.getName(), sign);
        return headers;
    }

    private static String sign(String api, String json, String nonce, String timestamp) {
        final String signData = String.join("\n",
                String.join(" ", "POST", api),
                API_KEY,
                nonce,
                timestamp,
                json
        );
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, SECRET_KEY).hmacHex(signData);
    }

    public static String decrypt(String encrypted, String key) throws Exception {
        return AesUtil.decrypt(encrypted, SECRET_KEY + key);
    }

}
