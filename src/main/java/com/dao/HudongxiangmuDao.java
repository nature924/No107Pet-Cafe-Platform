package com.dao;

import com.entity.HudongxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HudongxiangmuVO;
import com.entity.view.HudongxiangmuView;


/**
 * 互动项目
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface HudongxiangmuDao extends BaseMapper<HudongxiangmuEntity> {
	
	List<HudongxiangmuVO> selectListVO(@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);
	
	HudongxiangmuVO selectVO(@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);
	
	List<HudongxiangmuView> selectListView(@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);

	List<HudongxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);
	
	HudongxiangmuView selectView(@Param("ew") Wrapper<HudongxiangmuEntity> wrapper);
	
}
