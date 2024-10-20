package com.dao;

import com.entity.ChongwudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwudingdanVO;
import com.entity.view.ChongwudingdanView;


/**
 * 宠物订单
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface ChongwudingdanDao extends BaseMapper<ChongwudingdanEntity> {
	
	List<ChongwudingdanVO> selectListVO(@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);
	
	ChongwudingdanVO selectVO(@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);
	
	List<ChongwudingdanView> selectListView(@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);

	List<ChongwudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);
	
	ChongwudingdanView selectView(@Param("ew") Wrapper<ChongwudingdanEntity> wrapper);
	
}
