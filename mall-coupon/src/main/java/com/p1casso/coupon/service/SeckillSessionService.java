package com.p1casso.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 14:27:49
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
