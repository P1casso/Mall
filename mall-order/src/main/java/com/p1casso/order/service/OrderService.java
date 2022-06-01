package com.p1casso.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:12:40
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

