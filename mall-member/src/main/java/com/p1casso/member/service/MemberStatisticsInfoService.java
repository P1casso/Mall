package com.p1casso.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:06:34
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

