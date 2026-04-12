package com.campus.mall.service;

import com.campus.mall.entity.Cart;
import java.util.List;

public interface CartService {
    String addCart(Integer userId, Integer goodsId);
    void deleteCart(Integer id);
    List<Cart> getCartList(Integer userId);
}