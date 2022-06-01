package com.p1casso.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.p1casso.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 13:07:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
