package com.campus.mall.mapper;

import com.campus.mall.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    // 登录：根据用户名查用户
    @Select("SELECT * FROM t_user WHERE username = #{username}")
    User findByUsername(String username);

    // 注册：新增用户（核心新增）
    @Insert("INSERT INTO t_user (username, password) VALUES (#{username}, #{password})")
    int insertUser(User user);
}