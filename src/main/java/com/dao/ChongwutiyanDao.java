package com.dao;

import com.entity.ChongwutiyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwutiyanVO;
import com.entity.view.ChongwutiyanView;


/**
 * 宠物体验
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface ChongwutiyanDao extends BaseMapper<ChongwutiyanEntity> {
	
	List<ChongwutiyanVO> selectListVO(@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);
	
	ChongwutiyanVO selectVO(@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);
	
	List<ChongwutiyanView> selectListView(@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);

	List<ChongwutiyanView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);
	
	ChongwutiyanView selectView(@Param("ew") Wrapper<ChongwutiyanEntity> wrapper);
	
}
