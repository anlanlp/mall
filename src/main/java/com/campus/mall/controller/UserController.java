package com.campus.mall.controller;

import com.campus.mall.entity.User;
import com.campus.mall.service.UserService;
import com.campus.mall.vo.ResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // 用final修饰，构造器注入（Spring官方推荐写法）
    private final UserService userService;

    // 构造器注入（Spring 4.3+ 无需加@Autowired）
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 登录接口：POST更安全，避免密码暴露在URL地址栏
    @PostMapping("/login")
    public ResultVO<User> login(
            @RequestParam String username,
            @RequestParam String password
    ){
        User user = userService.login(username, password);
        if(user != null){
            user.setPassword(null); // 安全：不返回密码给前端
            return ResultVO.success("登录成功", user);
        }else{
            return ResultVO.error("用户名或密码错误");
        }
    }

    // 注册接口：POST更安全
    @PostMapping("/register")
    public ResultVO<String> register(
            @RequestParam String username,
            @RequestParam String password
    ){
        String result = userService.register(username, password);
        if (result.equals("注册成功！")) {
            return ResultVO.success(result);
        } else {
            return ResultVO.error(result);
        }
    }
}