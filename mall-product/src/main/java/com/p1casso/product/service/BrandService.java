package com.p1casso.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 13:41:40
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

