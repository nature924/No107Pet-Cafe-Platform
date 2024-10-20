package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusskafeicaipinEntity;
import com.entity.view.DiscusskafeicaipinView;

import com.service.DiscusskafeicaipinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 咖啡菜品评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@RestController
@RequestMapping("/discusskafeicaipin")
public class DiscusskafeicaipinController {
    @Autowired
    private DiscusskafeicaipinService discusskafeicaipinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusskafeicaipinEntity discusskafeicaipin,
		HttpServletRequest request){
        EntityWrapper<DiscusskafeicaipinEntity> ew = new EntityWrapper<DiscusskafeicaipinEntity>();
		PageUtils page = discusskafeicaipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusskafeicaipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusskafeicaipinEntity discusskafeicaipin, HttpServletRequest request){
        EntityWrapper<DiscusskafeicaipinEntity> ew = new EntityWrapper<DiscusskafeicaipinEntity>();
		PageUtils page = discusskafeicaipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusskafeicaipin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusskafeicaipinEntity discusskafeicaipin){
       	EntityWrapper<DiscusskafeicaipinEntity> ew = new EntityWrapper<DiscusskafeicaipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusskafeicaipin, "discusskafeicaipin")); 
        return R.ok().put("data", discusskafeicaipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusskafeicaipinEntity discusskafeicaipin){
        EntityWrapper< DiscusskafeicaipinEntity> ew = new EntityWrapper< DiscusskafeicaipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusskafeicaipin, "discusskafeicaipin")); 
		DiscusskafeicaipinView discusskafeicaipinView =  discusskafeicaipinService.selectView(ew);
		return R.ok("查询咖啡菜品评论表成功").put("data", discusskafeicaipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusskafeicaipinEntity discusskafeicaipin = discusskafeicaipinService.selectById(id);
        return R.ok().put("data", discusskafeicaipin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusskafeicaipinEntity discusskafeicaipin = discusskafeicaipinService.selectById(id);
        return R.ok().put("data", discusskafeicaipin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusskafeicaipinEntity discusskafeicaipin, HttpServletRequest request){
    	discusskafeicaipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusskafeicaipin);
        discusskafeicaipinService.insert(discusskafeicaipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusskafeicaipinEntity discusskafeicaipin, HttpServletRequest request){
    	discusskafeicaipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusskafeicaipin);
        discusskafeicaipinService.insert(discusskafeicaipin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusskafeicaipinEntity discusskafeicaipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusskafeicaipin);
        discusskafeicaipinService.updateById(discusskafeicaipin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusskafeicaipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusskafeicaipinEntity> wrapper = new EntityWrapper<DiscusskafeicaipinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusskafeicaipinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
