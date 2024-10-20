package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwutiyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwutiyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwutiyanView;


/**
 * 宠物体验
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface ChongwutiyanService extends IService<ChongwutiyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwutiyanVO> selectListVO(Wrapper<ChongwutiyanEntity> wrapper);
   	
   	ChongwutiyanVO selectVO(@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);
   	
   	List<ChongwutiyanView> selectListView(Wrapper<ChongwutiyanEntity> wrapper);
   	
   	ChongwutiyanView selectView(@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwutiyanEntity> wrapper);
   	
}

