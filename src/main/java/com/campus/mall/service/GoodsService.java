package com.campus.mall.service;

import com.campus.mall.entity.Goods;
import java.util.List;

public interface GoodsService {
    List<Goods> findAll();
    Goods findById(Integer id);
}