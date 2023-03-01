package org.example.base64DecodeCode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //Как создать Base64 кодировщик и декодировщик?
        String b64 = Base64.getEncoder().encodeToString("Samat".getBytes(StandardCharsets.UTF_8));
        System.out.println(b64);

        String decode = new String(Base64.getDecoder().decode(b64), StandardCharsets.UTF_8);
        System.out.println(decode);
    }
}
