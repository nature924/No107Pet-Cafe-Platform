package com.entity.view;

import com.entity.DiscusskafeicaipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 咖啡菜品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@TableName("discusskafeicaipin")
public class DiscusskafeicaipinView  extends DiscusskafeicaipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskafeicaipinView(){
	}
 
 	public DiscusskafeicaipinView(DiscusskafeicaipinEntity discusskafeicaipinEntity){
 	try {
			BeanUtils.copyProperties(this, discusskafeicaipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
