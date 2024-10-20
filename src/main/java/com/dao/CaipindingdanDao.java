package com.dao;

import com.entity.CaipindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipindingdanVO;
import com.entity.view.CaipindingdanView;


/**
 * 菜品订单
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface CaipindingdanDao extends BaseMapper<CaipindingdanEntity> {
	
	List<CaipindingdanVO> selectListVO(@Param("ew") Wrapper<CaipindingdanEntity> wrapper);
	
	CaipindingdanVO selectVO(@Param("ew") Wrapper<CaipindingdanEntity> wrapper);
	
	List<CaipindingdanView> selectListView(@Param("ew") Wrapper<CaipindingdanEntity> wrapper);

	List<CaipindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<CaipindingdanEntity> wrapper);
	
	CaipindingdanView selectView(@Param("ew") Wrapper<CaipindingdanEntity> wrapper);
	
}
