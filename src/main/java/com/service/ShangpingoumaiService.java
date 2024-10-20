package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpingoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpingoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpingoumaiView;


/**
 * 商品购买
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface ShangpingoumaiService extends IService<ShangpingoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpingoumaiVO> selectListVO(Wrapper<ShangpingoumaiEntity> wrapper);
   	
   	ShangpingoumaiVO selectVO(@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);
   	
   	List<ShangpingoumaiView> selectListView(Wrapper<ShangpingoumaiEntity> wrapper);
   	
   	ShangpingoumaiView selectView(@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpingoumaiEntity> wrapper);
   	
}

