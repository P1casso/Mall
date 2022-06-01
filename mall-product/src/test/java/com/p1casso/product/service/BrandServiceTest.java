package com.p1casso.product.service;


import com.p1casso.product.entity.BrandEntity;
import com.p1casso.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @Author p1casso
 * @Date 2022/6/1 4:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandServiceTest {

    @Resource
    BrandService brandService;

    @Test

    public void index() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("你好");
        boolean b = brandService.save(brandEntity);
        System.out.println(b);
    }

}