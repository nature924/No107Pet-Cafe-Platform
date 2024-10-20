package com.entity.vo;

import com.entity.JiankangzhuangkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康状况
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public class JiankangzhuangkuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhusheshijian;
		
	/**
	 * 毛发修剪
	 */
	
	private String maofaxiujian;
		
	/**
	 * 洗护时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xihushijian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
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
