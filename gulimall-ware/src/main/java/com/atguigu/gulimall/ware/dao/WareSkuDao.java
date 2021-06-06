package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dujianglong
 * @email dujianglong@gmail.com
 * @date 2021-05-29 11:41:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
