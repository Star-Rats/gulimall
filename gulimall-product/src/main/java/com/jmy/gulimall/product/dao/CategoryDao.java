package com.jmy.gulimall.product.dao;

import com.jmy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品三级分类
 * 
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 15:51:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
