package com.ft.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;

@Slf4j
public class OkHttpUtil {

    private static final OkHttpClient INSTANCE;

    static {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(message -> {
            if (StringUtils.isNotBlank(message)) {
                log.info(message);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        INSTANCE = new OkHttpClient.Builder().connectTimeout(Duration.ofSeconds(30)).readTimeout(Duration.ofSeconds(30)).writeTimeout(Duration.ofSeconds(30)).addInterceptor(httpLoggingInterceptor).build();
    }

    private OkHttpUtil() {
    }

    public static Response post(String api, String json, @Nullable Map<String, String> headers) throws IOException {
        final RequestBody requestBody = RequestBody.create(MediaType.parse(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), json.getBytes(StandardCharsets.UTF_8));
        final Request.Builder builder = new Request.Builder().url(api).post(requestBody);
        setHeaders(builder, headers);
        return INSTANCE.newCall(builder.build()).execute();
    }

    private static void setHeaders(Request.Builder builder, @Nullable Map<String, String> headers) {
        if (headers != null) {
            headers.forEach((key, value) -> {
                if (key != null && value != null) {
                    builder.header(key, value);
                }
            });
        }
    }

    /**
     *
     */
    public static String getResponseBody(Response response) throws IOException {
        if (response != null) {
            if (response.isSuccessful()) {
                if (response.body() != null) {
                    return response.body().string();
                } else {
                    log.error("{}", response);
                    response.close();
                }
            } else {
                log.warn("{}", response);
                response.close();
            }
        }
        return null;
    }

}
