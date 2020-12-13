package com.jmy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmy.common.utils.PageUtils;
import com.jmy.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 16:41:05
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

