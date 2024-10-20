package com.dao;

import com.entity.DiscusskafeicaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskafeicaipinVO;
import com.entity.view.DiscusskafeicaipinView;


/**
 * 咖啡菜品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface DiscusskafeicaipinDao extends BaseMapper<DiscusskafeicaipinEntity> {
	
	List<DiscusskafeicaipinVO> selectListVO(@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);
	
	DiscusskafeicaipinVO selectVO(@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);
	
	List<DiscusskafeicaipinView> selectListView(@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);

	List<DiscusskafeicaipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);
	
	DiscusskafeicaipinView selectView(@Param("ew") Wrapper<DiscusskafeicaipinEntity> wrapper);
	
}
