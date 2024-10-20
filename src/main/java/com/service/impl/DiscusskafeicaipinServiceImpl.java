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


import com.dao.DiscusskafeicaipinDao;
import com.entity.DiscusskafeicaipinEntity;
import com.service.DiscusskafeicaipinService;
import com.entity.vo.DiscusskafeicaipinVO;
import com.entity.view.DiscusskafeicaipinView;

@Service("discusskafeicaipinService")
public class DiscusskafeicaipinServiceImpl extends ServiceImpl<DiscusskafeicaipinDao, DiscusskafeicaipinEntity> implements DiscusskafeicaipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskafeicaipinEntity> page = this.selectPage(
                new Query<DiscusskafeicaipinEntity>(params).getPage(),
                new EntityWrapper<DiscusskafeicaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskafeicaipinEntity> wrapper) {
		  Page<DiscusskafeicaipinView> page =new Query<DiscusskafeicaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskafeicaipinVO> selectListVO(Wrapper<DiscusskafeicaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskafeicaipinVO selectVO(Wrapper<DiscusskafeicaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskafeicaipinView> selectListView(Wrapper<DiscusskafeicaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskafeicaipinView selectView(Wrapper<DiscusskafeicaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
