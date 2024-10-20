package com.dao;

import com.entity.KanhufuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KanhufuwuVO;
import com.entity.view.KanhufuwuView;


/**
 * 看护服务
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface KanhufuwuDao extends BaseMapper<KanhufuwuEntity> {
	
	List<KanhufuwuVO> selectListVO(@Param("ew") Wrapper<KanhufuwuEntity> wrapper);
	
	KanhufuwuVO selectVO(@Param("ew") Wrapper<KanhufuwuEntity> wrapper);
	
	List<KanhufuwuView> selectListView(@Param("ew") Wrapper<KanhufuwuEntity> wrapper);

	List<KanhufuwuView> selectListView(Pagination page,@Param("ew") Wrapper<KanhufuwuEntity> wrapper);
	
	KanhufuwuView selectView(@Param("ew") Wrapper<KanhufuwuEntity> wrapper);
	
}
