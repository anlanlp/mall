package com.campus.mall.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer id;
    private String name;
    private BigDecimal price;
    private String img;
    private String desc;
    private Integer stock;

    // Getter & Setter（必须保留，用于JSON序列化和MyBatis赋值）
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public String getImg() { return img; }
    public void setImg(String img) { this.img = img; }
    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
}