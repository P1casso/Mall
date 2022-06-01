package com.p1casso.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:12:40
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

