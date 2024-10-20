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


import com.dao.ShangpingoumaiDao;
import com.entity.ShangpingoumaiEntity;
import com.service.ShangpingoumaiService;
import com.entity.vo.ShangpingoumaiVO;
import com.entity.view.ShangpingoumaiView;

@Service("shangpingoumaiService")
public class ShangpingoumaiServiceImpl extends ServiceImpl<ShangpingoumaiDao, ShangpingoumaiEntity> implements ShangpingoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpingoumaiEntity> page = this.selectPage(
                new Query<ShangpingoumaiEntity>(params).getPage(),
                new EntityWrapper<ShangpingoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpingoumaiEntity> wrapper) {
		  Page<ShangpingoumaiView> page =new Query<ShangpingoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpingoumaiVO> selectListVO(Wrapper<ShangpingoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpingoumaiVO selectVO(Wrapper<ShangpingoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpingoumaiView> selectListView(Wrapper<ShangpingoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpingoumaiView selectView(Wrapper<ShangpingoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
