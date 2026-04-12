package com.campus.mall.service.impl;

import com.campus.mall.entity.User;
import com.campus.mall.mapper.UserMapper;
import com.campus.mall.service.UserService;
import com.campus.mall.utils.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 登录逻辑（已加密）
    @Override
    public User login(String username, String password) {
        User user = userMapper.findByUsername(username);
        if (user != null && PasswordEncoderUtil.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    // 注册逻辑（核心新增）
    @Override
    public String register(String username, String password) {
        // 1. 校验用户名是否已存在
        User existUser = userMapper.findByUsername(username);
        if (existUser != null) {
            return "用户名已存在！";
        }

        // 2. 密码加密
        String encodedPwd = PasswordEncoderUtil.encode(password);

        // 3. 新增用户
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(encodedPwd);
        int rows = userMapper.insertUser(newUser);

        // 4. 返回结果
        return rows > 0 ? "注册成功！" : "注册失败，请重试！";
    }
}