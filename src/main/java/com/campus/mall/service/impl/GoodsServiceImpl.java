package com.campus.mall.service.impl;

import com.campus.mall.entity.Goods;
import com.campus.mall.mapper.GoodsMapper;
import com.campus.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service  // 关键注解：必须添加，否则Spring无法识别为Bean
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public Goods findById(Integer id) {
        return goodsMapper.findById(id);
    }
}