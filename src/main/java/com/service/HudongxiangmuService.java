package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HudongxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HudongxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HudongxiangmuView;


/**
 * 互动项目
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface HudongxiangmuService extends IService<HudongxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HudongxiangmuVO> selectListVO(Wrapper<HudongxiangmuEntity> wrapper);
   	
   	HudongxiangmuVO selectVO(@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);
   	
   	List<HudongxiangmuView> selectListView(Wrapper<HudongxiangmuEntity> wrapper);
   	
   	HudongxiangmuView selectView(@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HudongxiangmuEntity> wrapper);
   	
}

