package com.campus.mall.controller;

import com.campus.mall.entity.Goods;
import com.campus.mall.service.GoodsService;
import com.campus.mall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    // 查询所有商品列表接口
    @GetMapping("/list")
    public ResultVO<List<Goods>> list() {
        List<Goods> goodsList = goodsService.findAll();
        return ResultVO.success("查询成功", goodsList);
    }

    // 根据ID查询商品详情接口
    @GetMapping("/detail/{id}")
    public ResultVO<Goods> detail(@PathVariable Integer id) {
        Goods goods = goodsService.findById(id);
        if (goods != null) {
            return ResultVO.success("查询成功", goods);
        } else {
            return ResultVO.error("商品不存在");
        }
    }
}