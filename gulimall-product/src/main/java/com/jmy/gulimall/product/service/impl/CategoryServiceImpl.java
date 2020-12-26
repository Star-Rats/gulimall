package com.jmy.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmy.common.utils.PageUtils;
import com.jmy.common.utils.Query;

import com.jmy.gulimall.product.dao.CategoryDao;
import com.jmy.gulimall.product.entity.CategoryEntity;
import com.jmy.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查询出所有分类
        List<CategoryEntity> cs = this.getBaseMapper().selectList(null);
        // 筛选出所有一级分类
        return cs.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0L)
                .peek(categoryEntity -> categoryEntity.setChildren(this.listChildren(categoryEntity,cs)))
                .sorted(Comparator.comparing(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> listChildren(CategoryEntity category,List<CategoryEntity> cs){
        // 递归查找子分类
        return cs.stream()
                .filter(entity -> entity.getParentCid().equals(category.getCatId()))
                .peek(c -> c.setChildren(this.listChildren(c,cs)))
                .sorted(Comparator.comparing(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }
}