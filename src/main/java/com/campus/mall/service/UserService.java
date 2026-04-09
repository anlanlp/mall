package com.campus.mall.service.impl;

import com.campus.mall.entity.User;

public interface UserService {
    /**
     * 用户登录方法
     * @param username 用户名
     * @param password 密码
     * @return 登录成功返回用户对象，失败返回null
     */
    User login(String username, String password);
}