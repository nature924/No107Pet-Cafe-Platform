package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuxinxiView;


/**
 * 宠物信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface DiscusschongwuxinxiService extends IService<DiscusschongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuxinxiVO> selectListVO(Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
   	DiscusschongwuxinxiVO selectVO(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
   	List<DiscusschongwuxinxiView> selectListView(Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
   	DiscusschongwuxinxiView selectView(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
}

