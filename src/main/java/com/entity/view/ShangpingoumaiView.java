package com.entity.view;

import com.entity.ShangpingoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@TableName("shangpingoumai")
public class ShangpingoumaiView  extends ShangpingoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpingoumaiView(){
	}
 
 	public ShangpingoumaiView(ShangpingoumaiEntity shangpingoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, shangpingoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
