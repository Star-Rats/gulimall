package com.jmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmy.common.utils.PageUtils;
import com.jmy.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 15:51:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

