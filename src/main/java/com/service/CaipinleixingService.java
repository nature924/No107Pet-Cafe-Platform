package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinleixingView;


/**
 * 菜品类型
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface CaipinleixingService extends IService<CaipinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinleixingVO> selectListVO(Wrapper<CaipinleixingEntity> wrapper);
   	
   	CaipinleixingVO selectVO(@Param("ew") Wrapper<CaipinleixingEntity> wrapper);
   	
   	List<CaipinleixingView> selectListView(Wrapper<CaipinleixingEntity> wrapper);
   	
   	CaipinleixingView selectView(@Param("ew") Wrapper<CaipinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinleixingEntity> wrapper);
   	
}

