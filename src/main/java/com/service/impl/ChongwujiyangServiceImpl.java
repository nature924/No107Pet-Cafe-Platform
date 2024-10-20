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


import com.dao.ChongwujiyangDao;
import com.entity.ChongwujiyangEntity;
import com.service.ChongwujiyangService;
import com.entity.vo.ChongwujiyangVO;
import com.entity.view.ChongwujiyangView;

@Service("chongwujiyangService")
public class ChongwujiyangServiceImpl extends ServiceImpl<ChongwujiyangDao, ChongwujiyangEntity> implements ChongwujiyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwujiyangEntity> page = this.selectPage(
                new Query<ChongwujiyangEntity>(params).getPage(),
                new EntityWrapper<ChongwujiyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwujiyangEntity> wrapper) {
		  Page<ChongwujiyangView> page =new Query<ChongwujiyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwujiyangVO> selectListVO(Wrapper<ChongwujiyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwujiyangVO selectVO(Wrapper<ChongwujiyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwujiyangView> selectListView(Wrapper<ChongwujiyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwujiyangView selectView(Wrapper<ChongwujiyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
