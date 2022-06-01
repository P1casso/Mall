package com.p1casso.coupon.dao;

import com.p1casso.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 14:27:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
