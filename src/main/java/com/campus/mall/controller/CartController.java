package com.campus.mall.controller;

import com.campus.mall.entity.Cart;
import com.campus.mall.service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // 加购接口（确保和前端地址一致）
    @PostMapping("/add")
    public String addCart(@RequestParam Integer userId, @RequestParam Integer goodsId) {
        return cartService.addCart(userId, goodsId);
    }

    // 购物车列表接口（直接返回数组）
    @GetMapping("/list/{userId}")
    public List<Cart> getCartList(@PathVariable("userId") Integer userId) {
        return cartService.getCartList(userId);
    }

    // 删除接口
    @DeleteMapping("/delete/{id}")
    public String deleteCart(@PathVariable Integer id) {
        cartService.deleteCart(id);
        return "删除成功";
    }
}