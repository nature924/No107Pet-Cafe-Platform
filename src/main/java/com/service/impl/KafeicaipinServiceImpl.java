package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KafeicaipinDao;
import com.entity.KafeicaipinEntity;
import com.service.KafeicaipinService;
import com.entity.vo.KafeicaipinVO;
import com.entity.view.KafeicaipinView;

@Service("kafeicaipinService")
public class KafeicaipinServiceImpl extends ServiceImpl<KafeicaipinDao, KafeicaipinEntity> implements KafeicaipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KafeicaipinEntity> page = this.selectPage(
                new Query<KafeicaipinEntity>(params).getPage(),
                new EntityWrapper<KafeicaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KafeicaipinEntity> wrapper) {
		  Page<KafeicaipinView> page =new Query<KafeicaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KafeicaipinVO> selectListVO(Wrapper<KafeicaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KafeicaipinVO selectVO(Wrapper<KafeicaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KafeicaipinView> selectListView(Wrapper<KafeicaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KafeicaipinView selectView(Wrapper<KafeicaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
