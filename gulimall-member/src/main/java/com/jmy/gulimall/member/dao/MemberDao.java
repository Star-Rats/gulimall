package com.jmy.gulimall.member.dao;

import com.jmy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 16:41:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
