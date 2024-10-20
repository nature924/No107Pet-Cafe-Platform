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

import com.entity.DiscusschongwuxinxiEntity;
import com.entity.view.DiscusschongwuxinxiView;

import com.service.DiscusschongwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宠物信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-17 15:15:30
 */
@RestController
@RequestMapping("/discusschongwuxinxi")
public class DiscusschongwuxinxiController {
    @Autowired
    private DiscusschongwuxinxiService discusschongwuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschongwuxinxiEntity discusschongwuxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();
		PageUtils page = discusschongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
        EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();
		PageUtils page = discusschongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschongwuxinxiEntity discusschongwuxinxi){
       	EntityWrapper<DiscusschongwuxinxiEntity> ew = new EntityWrapper<DiscusschongwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschongwuxinxi, "discusschongwuxinxi")); 
        return R.ok().put("data", discusschongwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschongwuxinxiEntity discusschongwuxinxi){
        EntityWrapper< DiscusschongwuxinxiEntity> ew = new EntityWrapper< DiscusschongwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschongwuxinxi, "discusschongwuxinxi")); 
		DiscusschongwuxinxiView discusschongwuxinxiView =  discusschongwuxinxiService.selectView(ew);
		return R.ok("查询宠物信息评论表成功").put("data", discusschongwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschongwuxinxiEntity discusschongwuxinxi = discusschongwuxinxiService.selectById(id);
        return R.ok().put("data", discusschongwuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschongwuxinxiEntity discusschongwuxinxi = discusschongwuxinxiService.selectById(id);
        return R.ok().put("data", discusschongwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
    	discusschongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschongwuxinxi);
        discusschongwuxinxiService.insert(discusschongwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
    	discusschongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschongwuxinxi);
        discusschongwuxinxiService.insert(discusschongwuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusschongwuxinxiEntity discusschongwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschongwuxinxi);
        discusschongwuxinxiService.updateById(discusschongwuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschongwuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscusschongwuxinxiEntity> wrapper = new EntityWrapper<DiscusschongwuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusschongwuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
