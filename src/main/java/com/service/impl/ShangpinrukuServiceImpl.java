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


import com.dao.ShangpinrukuDao;
import com.entity.ShangpinrukuEntity;
import com.service.ShangpinrukuService;
import com.entity.vo.ShangpinrukuVO;
import com.entity.view.ShangpinrukuView;

@Service("shangpinrukuService")
public class ShangpinrukuServiceImpl extends ServiceImpl<ShangpinrukuDao, ShangpinrukuEntity> implements ShangpinrukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinrukuEntity> page = this.selectPage(
                new Query<ShangpinrukuEntity>(params).getPage(),
                new EntityWrapper<ShangpinrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinrukuEntity> wrapper) {
		  Page<ShangpinrukuView> page =new Query<ShangpinrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinrukuVO> selectListVO(Wrapper<ShangpinrukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinrukuVO selectVO(Wrapper<ShangpinrukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinrukuView> selectListView(Wrapper<ShangpinrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinrukuView selectView(Wrapper<ShangpinrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
