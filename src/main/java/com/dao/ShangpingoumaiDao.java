package com.dao;

import com.entity.ShangpingoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpingoumaiVO;
import com.entity.view.ShangpingoumaiView;


/**
 * 商品购买
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface ShangpingoumaiDao extends BaseMapper<ShangpingoumaiEntity> {
	
	List<ShangpingoumaiVO> selectListVO(@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);
	
	ShangpingoumaiVO selectVO(@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);
	
	List<ShangpingoumaiView> selectListView(@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);

	List<ShangpingoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);
	
	ShangpingoumaiView selectView(@Param("ew") Wrapper<ShangpingoumaiEntity> wrapper);
	
}
