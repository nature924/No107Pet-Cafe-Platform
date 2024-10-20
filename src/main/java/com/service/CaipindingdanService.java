package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipindingdanView;


/**
 * 菜品订单
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface CaipindingdanService extends IService<CaipindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipindingdanVO> selectListVO(Wrapper<CaipindingdanEntity> wrapper);
   	
   	CaipindingdanVO selectVO(@Param("ew") Wrapper<CaipindingdanEntity> wrapper);
   	
   	List<CaipindingdanView> selectListView(Wrapper<CaipindingdanEntity> wrapper);
   	
   	CaipindingdanView selectView(@Param("ew") Wrapper<CaipindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipindingdanEntity> wrapper);
   	
}

