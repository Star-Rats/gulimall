package com.jmy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmy.common.utils.PageUtils;
import com.jmy.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 16:43:29
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

