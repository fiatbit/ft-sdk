package com.ft.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.util.Base64Utils;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Objects;

/**
 *
 */
@Slf4j
public class AesUtil {

    public static String encrypt(String data, String key) throws Exception {
        return Base64Utils.encodeToString(aesRandom(data.getBytes(StandardCharsets.UTF_8), key.getBytes(StandardCharsets.UTF_8), Cipher.ENCRYPT_MODE));
    }

    public static String decrypt(String encrypted, String key) throws Exception {
        return new String(aesRandom(Base64Utils.decodeFromString(encrypted), key.getBytes(StandardCharsets.UTF_8), Cipher.DECRYPT_MODE), StandardCharsets.UTF_8);
    }

    /**
     *
     */
    private static byte[] aesRandom(byte[] bytes, byte[] rawKeySeed, int mode) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchProviderException {
        final KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        final SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN");
        secureRandom.setSeed(rawKeySeed);
        keyGenerator.init(128, secureRandom);
        final SecretKey secretKey = keyGenerator.generateKey();
        final byte[] rawKey = secretKey.getEncoded();
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        final SecretKeySpec secretKeySpec = new SecretKeySpec(rawKey, "AES");
        cipher.init(mode, secretKeySpec, new IvParameterSpec(rawKey));
        return cipher.doFinal(bytes);
    }

    public static void main(String[] args) throws Exception {
        final String data = "SdkApplication";
        final String key = RandomStringUtils.randomNumeric(16) + System.currentTimeMillis();
        final String encrypted = encrypt(data, key);
        final String decrypted = decrypt(encrypted, key);
        log.info("{}, {}", decrypted, Objects.equals(decrypted, data));
    }

}
