package com.campus.mall.mapper;

import com.campus.mall.entity.Cart;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import java.util.List;

@Mapper
public interface CartMapper {
    @Insert("INSERT INTO t_cart(user_id, goods_id, num) VALUES(#{userId}, #{goodsId}, 1)")
    int addCart(Cart cart);

    @Delete("DELETE FROM t_cart WHERE id=#{id}")
    int deleteCart(Integer id);

    // 关键：查询购物车时，同时关联查询商品信息
    @Select("SELECT * FROM t_cart WHERE user_id=#{userId}")
    @Results({
            @Result(column="id", property="id"),
            @Result(column="user_id", property="userId"),
            @Result(column="goods_id", property="goodsId"),
            @Result(column="num", property="num"),
            @Result(column="goods_id", property="goods",
                    one=@One(select="com.campus.mall.mapper.GoodsMapper.findById", fetchType=FetchType.EAGER))
    })
    List<Cart> getCartList(Integer userId);
}