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
 * 看护服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@TableName("kanhufuwu")
public class KanhufuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KanhufuwuEntity() {
		
	}
	
	public KanhufuwuEntity(T t) {
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
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 性情
	 */
					
	private String xingqing;
	
	/**
	 * 寄养时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiyangshijian;
	
	/**
	 * 喂食
	 */
					
	private String weishi;
	
	/**
	 * 剪毛
	 */
					
	private String jianmao;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 领回时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date linghuishijian;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 看护姓名
	 */
					
	private String kanhuxingming;
	
	
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
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：性情
	 */
	public void setXingqing(String xingqing) {
		this.xingqing = xingqing;
	}
	/**
	 * 获取：性情
	 */
	public String getXingqing() {
		return xingqing;
	}
	/**
	 * 设置：寄养时间
	 */
	public void setJiyangshijian(Date jiyangshijian) {
		this.jiyangshijian = jiyangshijian;
	}
	/**
	 * 获取：寄养时间
	 */
	public Date getJiyangshijian() {
		return jiyangshijian;
	}
	/**
	 * 设置：喂食
	 */
	public void setWeishi(String weishi) {
		this.weishi = weishi;
	}
	/**
	 * 获取：喂食
	 */
	public String getWeishi() {
		return weishi;
	}
	/**
	 * 设置：剪毛
	 */
	public void setJianmao(String jianmao) {
		this.jianmao = jianmao;
	}
	/**
	 * 获取：剪毛
	 */
	public String getJianmao() {
		return jianmao;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：领回时间
	 */
	public void setLinghuishijian(Date linghuishijian) {
		this.linghuishijian = linghuishijian;
	}
	/**
	 * 获取：领回时间
	 */
	public Date getLinghuishijian() {
		return linghuishijian;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：看护姓名
	 */
	public void setKanhuxingming(String kanhuxingming) {
		this.kanhuxingming = kanhuxingming;
	}
	/**
	 * 获取：看护姓名
	 */
	public String getKanhuxingming() {
		return kanhuxingming;
	}

}
