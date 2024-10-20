package com.entity.view;

import com.entity.CaipindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
@TableName("caipindingdan")
public class CaipindingdanView  extends CaipindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipindingdanView(){
	}
 
 	public CaipindingdanView(CaipindingdanEntity caipindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, caipindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
