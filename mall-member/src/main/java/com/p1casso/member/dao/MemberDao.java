package com.p1casso.member.dao;

import com.p1casso.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:06:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
