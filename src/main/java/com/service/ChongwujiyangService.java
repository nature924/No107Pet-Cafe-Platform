package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwujiyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwujiyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwujiyangView;


/**
 * 宠物寄养
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface ChongwujiyangService extends IService<ChongwujiyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwujiyangVO> selectListVO(Wrapper<ChongwujiyangEntity> wrapper);
   	
   	ChongwujiyangVO selectVO(@Param("ew") Wrapper<ChongwujiyangEntity> wrapper);
   	
   	List<ChongwujiyangView> selectListView(Wrapper<ChongwujiyangEntity> wrapper);
   	
   	ChongwujiyangView selectView(@Param("ew") Wrapper<ChongwujiyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwujiyangEntity> wrapper);
   	
}

