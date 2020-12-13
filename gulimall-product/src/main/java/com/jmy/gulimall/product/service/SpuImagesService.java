package com.jmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmy.common.utils.PageUtils;
import com.jmy.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 15:51:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

