package com.p1casso.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p1casso.common.utils.PageUtils;
import com.p1casso.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author p1casso
 * @email p1casso
 * @date 2022-06-01 15:17:36
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

