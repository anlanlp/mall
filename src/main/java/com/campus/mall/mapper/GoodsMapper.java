package com.campus.mall.mapper;

import com.campus.mall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface GoodsMapper {
    // 查询所有商品列表
    @Select("SELECT * FROM t_goods")
    List<Goods> findAll();

    // 根据ID查询商品详情
    @Select("SELECT * FROM t_goods WHERE id = #{id}")
    Goods findById(Integer id);
}