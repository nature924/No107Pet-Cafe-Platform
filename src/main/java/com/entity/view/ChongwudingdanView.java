package com.entity.view;

import com.entity.ChongwudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
@TableName("chongwudingdan")
public class ChongwudingdanView  extends ChongwudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwudingdanView(){
	}
 
 	public ChongwudingdanView(ChongwudingdanEntity chongwudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, chongwudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
