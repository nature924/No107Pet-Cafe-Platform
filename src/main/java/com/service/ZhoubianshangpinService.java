package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubianshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubianshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubianshangpinView;


/**
 * 周边商品
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface ZhoubianshangpinService extends IService<ZhoubianshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubianshangpinVO> selectListVO(Wrapper<ZhoubianshangpinEntity> wrapper);
   	
   	ZhoubianshangpinVO selectVO(@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);
   	
   	List<ZhoubianshangpinView> selectListView(Wrapper<ZhoubianshangpinEntity> wrapper);
   	
   	ZhoubianshangpinView selectView(@Param("ew") Wrapper<ZhoubianshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubianshangpinEntity> wrapper);
   	
}

