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


import com.dao.KanhushiDao;
import com.entity.KanhushiEntity;
import com.service.KanhushiService;
import com.entity.vo.KanhushiVO;
import com.entity.view.KanhushiView;

@Service("kanhushiService")
public class KanhushiServiceImpl extends ServiceImpl<KanhushiDao, KanhushiEntity> implements KanhushiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KanhushiEntity> page = this.selectPage(
                new Query<KanhushiEntity>(params).getPage(),
                new EntityWrapper<KanhushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KanhushiEntity> wrapper) {
		  Page<KanhushiView> page =new Query<KanhushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KanhushiVO> selectListVO(Wrapper<KanhushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KanhushiVO selectVO(Wrapper<KanhushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KanhushiView> selectListView(Wrapper<KanhushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KanhushiView selectView(Wrapper<KanhushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
