package com.campus.mall.entity;

// 用户实体类
public class User {
    // 个人信息核心字段
    private Integer id;         // 个人ID
    private String username;    // 用户名
    private String password;    // 新增：密码字段（核心修复）
    private String avatar;      // 头像地址
    private String address;     // 地址
    private Integer coupon;     // 优惠券数量
    private Double balance;     // 钱包余额

    // 无参构造（移除固定id，避免注册时主键冲突，仅保留默认基础信息）
    public User() {
        this.avatar = "https://img.icons8.com/fluency/96/000000/user-male-circle.png";
        this.address = "湖北省武汉市洪山区光谷软件园A1栋";
        this.coupon = 999;
        this.balance = 99999.0;
    }

    // 全量Getter + Setter（补齐password的get/set，解决报错）
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    // 新增：password的getter和setter（核心修复点）
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Integer getCoupon() { return coupon; }
    public void setCoupon(Integer coupon) { this.coupon = coupon; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }
}