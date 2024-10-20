package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhoubianshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhoubianshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhoubianshangpinView;


/**
 * 周边商品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface DiscusszhoubianshangpinService extends IService<DiscusszhoubianshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhoubianshangpinVO> selectListVO(Wrapper<DiscusszhoubianshangpinEntity> wrapper);
   	
   	DiscusszhoubianshangpinVO selectVO(@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);
   	
   	List<DiscusszhoubianshangpinView> selectListView(Wrapper<DiscusszhoubianshangpinEntity> wrapper);
   	
   	DiscusszhoubianshangpinView selectView(@Param("ew") Wrapper<DiscusszhoubianshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhoubianshangpinEntity> wrapper);
   	
}

