package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KafeicaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KafeicaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KafeicaipinView;


/**
 * 咖啡菜品
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:15:29
 */
public interface KafeicaipinService extends IService<KafeicaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KafeicaipinVO> selectListVO(Wrapper<KafeicaipinEntity> wrapper);
   	
   	KafeicaipinVO selectVO(@Param("ew") Wrapper<KafeicaipinEntity> wrapper);
   	
   	List<KafeicaipinView> selectListView(Wrapper<KafeicaipinEntity> wrapper);
   	
   	KafeicaipinView selectView(@Param("ew") Wrapper<KafeicaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KafeicaipinEntity> wrapper);
   	
}

