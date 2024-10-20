package com.dao;

import com.entity.DiscusszhoubianshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhoubianshangpinVO;
import com.entity.view.DiscusszhoubianshangpinView;


/**
 * 周边商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface DiscusszhoubianshangpinDao extends BaseMapper<DiscusszhoubianshangpinEntity> {
	
	List<DiscusszhoubianshangpinVO> selectListVO(@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);
	
	DiscusszhoubianshangpinVO selectVO(@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);
	
	List<DiscusszhoubianshangpinView> selectListView(@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);

	List<DiscusszhoubianshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);
	
	DiscusszhoubianshangpinView selectView(@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);
	
}
