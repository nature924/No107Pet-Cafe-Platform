package com.dao;

import com.entity.JiankangzhuangkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangzhuangkuangVO;
import com.entity.view.JiankangzhuangkuangView;


/**
 * 健康状况
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface JiankangzhuangkuangDao extends BaseMapper<JiankangzhuangkuangEntity> {
	
	List<JiankangzhuangkuangVO> selectListVO(@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);
	
	JiankangzhuangkuangVO selectVO(@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);
	
	List<JiankangzhuangkuangView> selectListView(@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);

	List<JiankangzhuangkuangView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);
	
	JiankangzhuangkuangView selectView(@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);
	
}
