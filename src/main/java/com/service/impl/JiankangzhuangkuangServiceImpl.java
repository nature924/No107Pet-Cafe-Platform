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


import com.dao.JiankangzhuangkuangDao;
import com.entity.JiankangzhuangkuangEntity;
import com.service.JiankangzhuangkuangService;
import com.entity.vo.JiankangzhuangkuangVO;
import com.entity.view.JiankangzhuangkuangView;

@Service("jiankangzhuangkuangService")
public class JiankangzhuangkuangServiceImpl extends ServiceImpl<JiankangzhuangkuangDao, JiankangzhuangkuangEntity> implements JiankangzhuangkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangzhuangkuangEntity> page = this.selectPage(
                new Query<JiankangzhuangkuangEntity>(params).getPage(),
                new EntityWrapper<JiankangzhuangkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangzhuangkuangEntity> wrapper) {
		  Page<JiankangzhuangkuangView> page =new Query<JiankangzhuangkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangzhuangkuangVO> selectListVO(Wrapper<JiankangzhuangkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangzhuangkuangVO selectVO(Wrapper<JiankangzhuangkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangzhuangkuangView> selectListView(Wrapper<JiankangzhuangkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangzhuangkuangView selectView(Wrapper<JiankangzhuangkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
