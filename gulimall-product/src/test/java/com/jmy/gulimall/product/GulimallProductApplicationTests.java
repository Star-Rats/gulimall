package com.jmy.gulimall.product;

import com.jmy.gulimall.product.entity.BrandEntity;
import com.jmy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();

        brand.setDescript("666");
        brand.setName("666手机");
        brandService.save(brand);
    }

}
