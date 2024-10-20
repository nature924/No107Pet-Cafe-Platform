package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwudingdanView;


/**
 * 宠物订单
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface ChongwudingdanService extends IService<ChongwudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwudingdanVO> selectListVO(Wrapper<ChongwudingdanEntity> wrapper);
   	
   	ChongwudingdanVO selectVO(@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);
   	
   	List<ChongwudingdanView> selectListView(Wrapper<ChongwudingdanEntity> wrapper);
   	
   	ChongwudingdanView selectView(@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwudingdanEntity> wrapper);
   	
}

