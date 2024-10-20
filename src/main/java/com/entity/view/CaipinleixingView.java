package com.entity.view;

import com.entity.CaipinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
@TableName("caipinleixing")
public class CaipinleixingView  extends CaipinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinleixingView(){
	}
 
 	public CaipinleixingView(CaipinleixingEntity caipinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, caipinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
