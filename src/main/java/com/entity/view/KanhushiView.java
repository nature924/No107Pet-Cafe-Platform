package com.entity.view;

import com.entity.KanhushiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 看护师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
@TableName("kanhushi")
public class KanhushiView  extends KanhushiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KanhushiView(){
	}
 
 	public KanhushiView(KanhushiEntity kanhushiEntity){
 	try {
			BeanUtils.copyProperties(this, kanhushiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
