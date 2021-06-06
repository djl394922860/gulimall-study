package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dujianglong
 * @email dujianglong@gmail.com
 * @date 2021-05-29 11:30:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
