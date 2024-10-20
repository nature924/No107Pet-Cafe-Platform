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


import com.dao.CaipindingdanDao;
import com.entity.CaipindingdanEntity;
import com.service.CaipindingdanService;
import com.entity.vo.CaipindingdanVO;
import com.entity.view.CaipindingdanView;

@Service("caipindingdanService")
public class CaipindingdanServiceImpl extends ServiceImpl<CaipindingdanDao, CaipindingdanEntity> implements CaipindingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipindingdanEntity> page = this.selectPage(
                new Query<CaipindingdanEntity>(params).getPage(),
                new EntityWrapper<CaipindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipindingdanEntity> wrapper) {
		  Page<CaipindingdanView> page =new Query<CaipindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipindingdanVO> selectListVO(Wrapper<CaipindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipindingdanVO selectVO(Wrapper<CaipindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipindingdanView> selectListView(Wrapper<CaipindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipindingdanView selectView(Wrapper<CaipindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
