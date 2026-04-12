package com.campus.mall.service;

import com.campus.mall.entity.User;

public interface UserService {
    // 登录
    User login(String username, String password);

    // 注册（核心新增）
    String register(String username, String password);
}