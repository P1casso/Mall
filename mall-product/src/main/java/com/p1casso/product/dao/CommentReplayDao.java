package com.p1casso.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.p1casso.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 13:41:40
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
