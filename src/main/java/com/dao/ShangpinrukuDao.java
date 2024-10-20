package com.dao;

import com.entity.ShangpinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinrukuVO;
import com.entity.view.ShangpinrukuView;


/**
 * 商品入库
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface ShangpinrukuDao extends BaseMapper<ShangpinrukuEntity> {
	
	List<ShangpinrukuVO> selectListVO(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	ShangpinrukuVO selectVO(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	List<ShangpinrukuView> selectListView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);

	List<ShangpinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	ShangpinrukuView selectView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
}
