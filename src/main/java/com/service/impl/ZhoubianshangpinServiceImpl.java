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


import com.dao.ZhoubianshangpinDao;
import com.entity.ZhoubianshangpinEntity;
import com.service.ZhoubianshangpinService;
import com.entity.vo.ZhoubianshangpinVO;
import com.entity.view.ZhoubianshangpinView;

@Service("zhoubianshangpinService")
public class ZhoubianshangpinServiceImpl extends ServiceImpl<ZhoubianshangpinDao, ZhoubianshangpinEntity> implements ZhoubianshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubianshangpinEntity> page = this.selectPage(
                new Query<ZhoubianshangpinEntity>(params).getPage(),
                new EntityWrapper<ZhoubianshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubianshangpinEntity> wrapper) {
		  Page<ZhoubianshangpinView> page =new Query<ZhoubianshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubianshangpinVO> selectListVO(Wrapper<ZhoubianshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubianshangpinVO selectVO(Wrapper<ZhoubianshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubianshangpinView> selectListView(Wrapper<ZhoubianshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubianshangpinView selectView(Wrapper<ZhoubianshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
