package com.p1casso.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:17:36
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

