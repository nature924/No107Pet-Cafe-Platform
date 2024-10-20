package com.entity.view;

import com.entity.ChongwutiyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物体验
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
@TableName("chongwutiyan")
public class ChongwutiyanView  extends ChongwutiyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwutiyanView(){
	}
 
 	public ChongwutiyanView(ChongwutiyanEntity chongwutiyanEntity){
 	try {
			BeanUtils.copyProperties(this, chongwutiyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
