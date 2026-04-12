package com.campus.mall.entity;

public class Cart {
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer num;

    // 关键！必须加上这个字段，否则Mapper关联查询无效
    private Goods goods;

    // 全量Getter/Setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getGoodsId() { return goodsId; }
    public void setGoodsId(Integer goodsId) { this.goodsId = goodsId; }

    public Integer getNum() { return num; }
    public void setNum(Integer num) { this.num = num; }

    public Goods getGoods() { return goods; }
    public void setGoods(Goods goods) { this.goods = goods; }
}