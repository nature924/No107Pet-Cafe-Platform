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


import com.dao.HudongxiangmuDao;
import com.entity.HudongxiangmuEntity;
import com.service.HudongxiangmuService;
import com.entity.vo.HudongxiangmuVO;
import com.entity.view.HudongxiangmuView;

@Service("hudongxiangmuService")
public class HudongxiangmuServiceImpl extends ServiceImpl<HudongxiangmuDao, HudongxiangmuEntity> implements HudongxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HudongxiangmuEntity> page = this.selectPage(
                new Query<HudongxiangmuEntity>(params).getPage(),
                new EntityWrapper<HudongxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HudongxiangmuEntity> wrapper) {
		  Page<HudongxiangmuView> page =new Query<HudongxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HudongxiangmuVO> selectListVO(Wrapper<HudongxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HudongxiangmuVO selectVO(Wrapper<HudongxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HudongxiangmuView> selectListView(Wrapper<HudongxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HudongxiangmuView selectView(Wrapper<HudongxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
