package com.campus.mall.controller;

import com.campus.mall.entity.UserInfo;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("/user/info") // 修复：修改路径，避免和UserController冲突
public class UserInfoController {
    private static final UserInfo USER_INFO = new UserInfo();

    // 获取个人信息：GET /user/info
    @GetMapping
    public UserInfo getUserInfo() {
        return USER_INFO;
    }

    // 扣减钱包余额：POST /user/info/deductBalance
    @PostMapping("/deductBalance")
    @ResponseBody
    public String deductBalance(@RequestParam Double amount) {
        if (amount <= 0) {
            return "扣减金额必须大于0";
        }
        if (USER_INFO.getWalletBalance() < amount) {
            return "余额不足！当前余额：" + USER_INFO.getWalletBalance();
        }
        BigDecimal newBalance = BigDecimal.valueOf(USER_INFO.getWalletBalance())
                .subtract(BigDecimal.valueOf(amount))
                .setScale(2, RoundingMode.HALF_UP);
        USER_INFO.setWalletBalance(newBalance.doubleValue());
        return "支付成功！当前余额：" + newBalance;
    }
}