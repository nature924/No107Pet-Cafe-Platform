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


import com.dao.ShangpinleixingDao;
import com.entity.ShangpinleixingEntity;
import com.service.ShangpinleixingService;
import com.entity.vo.ShangpinleixingVO;
import com.entity.view.ShangpinleixingView;

@Service("shangpinleixingService")
public class ShangpinleixingServiceImpl extends ServiceImpl<ShangpinleixingDao, ShangpinleixingEntity> implements ShangpinleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinleixingEntity> page = this.selectPage(
                new Query<ShangpinleixingEntity>(params).getPage(),
                new EntityWrapper<ShangpinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinleixingEntity> wrapper) {
		  Page<ShangpinleixingView> page =new Query<ShangpinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinleixingVO> selectListVO(Wrapper<ShangpinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinleixingVO selectVO(Wrapper<ShangpinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinleixingView> selectListView(Wrapper<ShangpinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinleixingView selectView(Wrapper<ShangpinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
