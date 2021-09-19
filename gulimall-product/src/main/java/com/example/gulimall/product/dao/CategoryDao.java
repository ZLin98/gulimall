package com.example.gulimall.product.dao;

import com.example.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zl
 * @email 
 * @date 2021-09-02 21:48:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
