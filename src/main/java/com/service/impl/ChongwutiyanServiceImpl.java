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


import com.dao.ChongwutiyanDao;
import com.entity.ChongwutiyanEntity;
import com.service.ChongwutiyanService;
import com.entity.vo.ChongwutiyanVO;
import com.entity.view.ChongwutiyanView;

@Service("chongwutiyanService")
public class ChongwutiyanServiceImpl extends ServiceImpl<ChongwutiyanDao, ChongwutiyanEntity> implements ChongwutiyanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwutiyanEntity> page = this.selectPage(
                new Query<ChongwutiyanEntity>(params).getPage(),
                new EntityWrapper<ChongwutiyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwutiyanEntity> wrapper) {
		  Page<ChongwutiyanView> page =new Query<ChongwutiyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwutiyanVO> selectListVO(Wrapper<ChongwutiyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwutiyanVO selectVO(Wrapper<ChongwutiyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwutiyanView> selectListView(Wrapper<ChongwutiyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwutiyanView selectView(Wrapper<ChongwutiyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
