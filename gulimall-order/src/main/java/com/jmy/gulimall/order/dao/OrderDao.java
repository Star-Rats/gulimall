package com.jmy.gulimall.order.dao;

import com.jmy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 16:43:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
