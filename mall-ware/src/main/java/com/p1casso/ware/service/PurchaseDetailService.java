package com.p1casso.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:17:36
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

