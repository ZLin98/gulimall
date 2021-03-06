package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zl
 * @email 
 * @date 2021-09-03 19:53:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
