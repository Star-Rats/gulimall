package com.jmy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmy.common.utils.PageUtils;
import com.jmy.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 16:43:30
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

