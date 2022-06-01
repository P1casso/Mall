package com.p1casso.ware.dao;

import com.p1casso.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:17:36
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
