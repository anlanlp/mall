package com.campus.mall.utils;

import org.springframework.util.DigestUtils;

public class PasswordEncoderUtil {
    // 去掉盐值，纯MD5加密，和数据库test的密码匹配
    public static String encode(String password) {
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }

    public static boolean matches(String rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}