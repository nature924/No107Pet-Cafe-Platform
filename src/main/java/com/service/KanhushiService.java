package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KanhushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KanhushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KanhushiView;


/**
 * 看护师
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface KanhushiService extends IService<KanhushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KanhushiVO> selectListVO(Wrapper<KanhushiEntity> wrapper);
   	
   	KanhushiVO selectVO(@Param("ew") Wrapper<KanhushiEntity> wrapper);
   	
   	List<KanhushiView> selectListView(Wrapper<KanhushiEntity> wrapper);
   	
   	KanhushiView selectView(@Param("ew") Wrapper<KanhushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KanhushiEntity> wrapper);
   	
}

