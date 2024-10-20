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


import com.dao.KanhufuwuDao;
import com.entity.KanhufuwuEntity;
import com.service.KanhufuwuService;
import com.entity.vo.KanhufuwuVO;
import com.entity.view.KanhufuwuView;

@Service("kanhufuwuService")
public class KanhufuwuServiceImpl extends ServiceImpl<KanhufuwuDao, KanhufuwuEntity> implements KanhufuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KanhufuwuEntity> page = this.selectPage(
                new Query<KanhufuwuEntity>(params).getPage(),
                new EntityWrapper<KanhufuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KanhufuwuEntity> wrapper) {
		  Page<KanhufuwuView> page =new Query<KanhufuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KanhufuwuVO> selectListVO(Wrapper<KanhufuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KanhufuwuVO selectVO(Wrapper<KanhufuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KanhufuwuView> selectListView(Wrapper<KanhufuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KanhufuwuView selectView(Wrapper<KanhufuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
