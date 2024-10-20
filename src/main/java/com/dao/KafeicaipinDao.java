package com.dao;

import com.entity.KafeicaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KafeicaipinVO;
import com.entity.view.KafeicaipinView;


/**
 * 咖啡菜品
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface KafeicaipinDao extends BaseMapper<KafeicaipinEntity> {
	
	List<KafeicaipinVO> selectListVO(@Param("ew") Wrapper<KafeicaipinEntity> wrapper);
	
	KafeicaipinVO selectVO(@Param("ew") Wrapper<KafeicaipinEntity> wrapper);
	
	List<KafeicaipinView> selectListView(@Param("ew") Wrapper<KafeicaipinEntity> wrapper);

	List<KafeicaipinView> selectListView(Pagination page,@Param("ew") Wrapper<KafeicaipinEntity> wrapper);
	
	KafeicaipinView selectView(@Param("ew") Wrapper<KafeicaipinEntity> wrapper);
	
}
