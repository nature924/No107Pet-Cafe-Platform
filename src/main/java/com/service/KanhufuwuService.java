package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KanhufuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KanhufuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KanhufuwuView;


/**
 * 看护服务
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface KanhufuwuService extends IService<KanhufuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KanhufuwuVO> selectListVO(Wrapper<KanhufuwuEntity> wrapper);
   	
   	KanhufuwuVO selectVO(@Param("ew") Wrapper<KanhufuwuEntity> wrapper);
   	
   	List<KanhufuwuView> selectListView(Wrapper<KanhufuwuEntity> wrapper);
   	
   	KanhufuwuView selectView(@Param("ew") Wrapper<KanhufuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KanhufuwuEntity> wrapper);
   	
}

