package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangzhuangkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangzhuangkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangzhuangkuangView;


/**
 * 健康状况
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
public interface JiankangzhuangkuangService extends IService<JiankangzhuangkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangzhuangkuangVO> selectListVO(Wrapper<JiankangzhuangkuangEntity> wrapper);
   	
   	JiankangzhuangkuangVO selectVO(@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);
   	
   	List<JiankangzhuangkuangView> selectListView(Wrapper<JiankangzhuangkuangEntity> wrapper);
   	
   	JiankangzhuangkuangView selectView(@Param("ew") Wrapper<JiankangzhuangkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangzhuangkuangEntity> wrapper);
   	
}

