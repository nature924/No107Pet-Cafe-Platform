package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskafeicaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskafeicaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskafeicaipinView;


/**
 * 咖啡菜品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface DiscusskafeicaipinService extends IService<DiscusskafeicaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskafeicaipinVO> selectListVO(Wrapper<DiscusskafeicaipinEntity> wrapper);
   	
   	DiscusskafeicaipinVO selectVO(@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);
   	
   	List<DiscusskafeicaipinView> selectListView(Wrapper<DiscusskafeicaipinEntity> wrapper);
   	
   	DiscusskafeicaipinView selectView(@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskafeicaipinEntity> wrapper);
   	
}

