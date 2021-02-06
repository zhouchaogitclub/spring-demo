package com.zc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author 周超
 * @since 2020/9/26 15:41
 */
@RestController
public class StockController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("deduct")
    public String deduct() {
        synchronized (this) {
            int stock = Integer.parseInt(Objects.requireNonNull(stringRedisTemplate.opsForValue().get("stock")));
            if (stock > 0) {
                int realStock = stock - 1;
                stringRedisTemplate.opsForValue().set("stock", String.valueOf(realStock));
                System.out.println("扣减成功，剩余库存为:" + realStock);
            } else {
                System.out.println("扣减失败，库存不足");
            }
        }
        return "end";
    }
}
