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


import com.dao.DiscusszhoubianshangpinDao;
import com.entity.DiscusszhoubianshangpinEntity;
import com.service.DiscusszhoubianshangpinService;
import com.entity.vo.DiscusszhoubianshangpinVO;
import com.entity.view.DiscusszhoubianshangpinView;

@Service("discusszhoubianshangpinService")
public class DiscusszhoubianshangpinServiceImpl extends ServiceImpl<DiscusszhoubianshangpinDao, DiscusszhoubianshangpinEntity> implements DiscusszhoubianshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhoubianshangpinEntity> page = this.selectPage(
                new Query<DiscusszhoubianshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusszhoubianshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhoubianshangpinEntity> wrapper) {
		  Page<DiscusszhoubianshangpinView> page =new Query<DiscusszhoubianshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhoubianshangpinVO> selectListVO(Wrapper<DiscusszhoubianshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhoubianshangpinVO selectVO(Wrapper<DiscusszhoubianshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhoubianshangpinView> selectListView(Wrapper<DiscusszhoubianshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhoubianshangpinView selectView(Wrapper<DiscusszhoubianshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
