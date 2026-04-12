package com.campus.mall.entity;
import lombok.Data;

@Data
public class UserInfo {
    private Long userId = 10001L;
    private String userName = "拼淘狗会员";
    private String avatarUrl = "/img/touxiang.png";
    private String address = "湖北省武汉市洪山区光谷广场世界城";
    private Integer couponNum = 999;
    private Double walletBalance = 99999.00;
}