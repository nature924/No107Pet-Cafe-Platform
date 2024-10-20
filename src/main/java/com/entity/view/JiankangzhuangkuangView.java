package com.entity.view;

import com.entity.JiankangzhuangkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康状况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@TableName("jiankangzhuangkuang")
public class JiankangzhuangkuangView  extends JiankangzhuangkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangzhuangkuangView(){
	}
 
 	public JiankangzhuangkuangView(JiankangzhuangkuangEntity jiankangzhuangkuangEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangzhuangkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
