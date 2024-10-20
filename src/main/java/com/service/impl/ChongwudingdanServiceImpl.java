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


import com.dao.ChongwudingdanDao;
import com.entity.ChongwudingdanEntity;
import com.service.ChongwudingdanService;
import com.entity.vo.ChongwudingdanVO;
import com.entity.view.ChongwudingdanView;

@Service("chongwudingdanService")
public class ChongwudingdanServiceImpl extends ServiceImpl<ChongwudingdanDao, ChongwudingdanEntity> implements ChongwudingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwudingdanEntity> page = this.selectPage(
                new Query<ChongwudingdanEntity>(params).getPage(),
                new EntityWrapper<ChongwudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwudingdanEntity> wrapper) {
		  Page<ChongwudingdanView> page =new Query<ChongwudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwudingdanVO> selectListVO(Wrapper<ChongwudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwudingdanVO selectVO(Wrapper<ChongwudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwudingdanView> selectListView(Wrapper<ChongwudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwudingdanView selectView(Wrapper<ChongwudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
