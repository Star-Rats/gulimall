package com.jmy.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.jmy.gulimall.product.valid.AddGroup;
import com.jmy.gulimall.product.valid.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author jiangmingyang
 * @email jiangmingyang6ge6@163.com
 * @date 2020-12-13 15:51:49
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "品牌ID不能为空",groups = {UpdateGroup.class})
	@Null(message = "新增操作品牌ID为空",groups = {AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotNull(message = "品牌名不能为空",groups = {UpdateGroup.class,AddGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(message = "logo不能为空",groups = {UpdateGroup.class,AddGroup.class})
	@URL(message = "logo必须是一个合法的URL",groups = {UpdateGroup.class,AddGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须是一个字母",groups = {UpdateGroup.class,AddGroup.class})
	@NotEmpty
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0,message = "sort必须大于等于0",groups = {UpdateGroup.class,AddGroup.class})
	@NotNull
	private Integer sort;

}
