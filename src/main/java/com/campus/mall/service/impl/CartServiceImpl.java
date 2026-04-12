package com.campus.mall.service.impl;

import com.campus.mall.entity.Cart;
import com.campus.mall.mapper.CartMapper;
import com.campus.mall.service.CartService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartMapper cartMapper;

    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    @Override
    public String addCart(Integer userId, Integer goodsId) {
        Cart cart = new Cart();
        cart.setUserId(userId);
        cart.setGoodsId(goodsId);
        cart.setNum(1);
        int result = cartMapper.addCart(cart);
        if(result > 0){
            return "加入购物车成功！";
        }else{
            return "加入购物车失败！";
        }
    }

    @Override
    public void deleteCart(Integer id) {
        cartMapper.deleteCart(id);
    }

    @Override
    public List<Cart> getCartList(Integer userId) {
        return cartMapper.getCartList(userId);
    }
}