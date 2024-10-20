package com.dao;

import com.entity.KanhushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KanhushiVO;
import com.entity.view.KanhushiView;


/**
 * 看护师
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface KanhushiDao extends BaseMapper<KanhushiEntity> {
	
	List<KanhushiVO> selectListVO(@Param("ew") Wrapper<KanhushiEntity> wrapper);
	
	KanhushiVO selectVO(@Param("ew") Wrapper<KanhushiEntity> wrapper);
	
	List<KanhushiView> selectListView(@Param("ew") Wrapper<KanhushiEntity> wrapper);

	List<KanhushiView> selectListView(Pagination page,@Param("ew") Wrapper<KanhushiEntity> wrapper);
	
	KanhushiView selectView(@Param("ew") Wrapper<KanhushiEntity> wrapper);
	
}
