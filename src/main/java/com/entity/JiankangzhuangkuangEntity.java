package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康状况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@TableName("jiankangzhuangkuang")
public class JiankangzhuangkuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangzhuangkuangEntity() {
		
	}
	
	public JiankangzhuangkuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
	/**
	 * 宠物类型
	 */
					
	private String chongwuleixing;
	
	/**
	 * 品种
	 */
					
	private String pinzhong;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 注射疫苗次数
	 */
					
	private String zhusheyimiaocishu;
	
	/**
	 * 注射时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhusheshijian;
	
	/**
	 * 毛发修剪
	 */
					
	private String maofaxiujian;
	
	/**
	 * 洗护时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xihushijian;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
	/**
	 * 设置：宠物类型
	 */
	public void setChongwuleixing(String chongwuleixing) {
		this.chongwuleixing = chongwuleixing;
	}
	/**
	 * 获取：宠物类型
	 */
	public String getChongwuleixing() {
		return chongwuleixing;
	}
	/**
	 * 设置：品种
	 */
	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}
	/**
	 * 获取：品种
	 */
	public String getPinzhong() {
		return pinzhong;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：注射疫苗次数
	 */
	public void setZhusheyimiaocishu(String zhusheyimiaocishu) {
		this.zhusheyimiaocishu = zhusheyimiaocishu;
	}
	/**
	 * 获取：注射疫苗次数
	 */
	public String getZhusheyimiaocishu() {
		return zhusheyimiaocishu;
	}
	/**
	 * 设置：注射时间
	 */
	public void setZhusheshijian(Date zhusheshijian) {
		this.zhusheshijian = zhusheshijian;
	}
	/**
	 * 获取：注射时间
	 */
	public Date getZhusheshijian() {
		return zhusheshijian;
	}
	/**
	 * 设置：毛发修剪
	 */
	public void setMaofaxiujian(String maofaxiujian) {
		this.maofaxiujian = maofaxiujian;
	}
	/**
	 * 获取：毛发修剪
	 */
	public String getMaofaxiujian() {
		return maofaxiujian;
	}
	/**
	 * 设置：洗护时间
	 */
	public void setXihushijian(Date xihushijian) {
		this.xihushijian = xihushijian;
	}
	/**
	 * 获取：洗护时间
	 */
	public Date getXihushijian() {
		return xihushijian;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
