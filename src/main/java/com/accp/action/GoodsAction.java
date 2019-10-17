package com.accp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.accp.biz.*;
import com.accp.pojo.*;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/goods")
public class GoodsAction {
	@Autowired
	private GoodsBiz biz;
	
	@GetMapping("/querypage/{pagenum}/{pagesize}")
	public PageInfo<Goods> queryPage(@PathVariable Integer pagenum,@PathVariable Integer pagesize){
		return biz.queryByPage(pagenum, pagesize);
	}
	
	@GetMapping("/queryOne/{gid}")
	public Goods queryById(@PathVariable Integer gid) {
		return biz.queryOne(gid);
	}
	
	@PutMapping("/updategoods")
	public HashMap<String, Object> updateGoods(@RequestBody Goods goods){
		Integer i=biz.updateGoods(goods);
		
		HashMap<String, Object> message=new HashMap<String, Object>();
		if(i>0) {
			message.put("code", 200);
		}else {
			message.put("code", 500);
		}
		return message;
	}
	
	@GetMapping("/deletegoods/{gid}")
	public HashMap<String, Object> updateGoods(@PathVariable Integer gid){
		Integer i=biz.deleteGoods(gid);
		
		HashMap<String, Object> message=new HashMap<String, Object>();
		if(i>0) {
			message.put("code", 200);
		}else {
			message.put("code", 500);
		}
		return message;
	}
	
	@PostMapping("/insertgoods")
	public HashMap<String, Object> insertGoods(@RequestBody Goods goods){
		Integer i=biz.insertGoods(goods);
		
		HashMap<String, Object> message=new HashMap<String, Object>();
		if(i>0) {
			message.put("code", 200);
		}else {
			message.put("code", 500);
		}
		return message;
	}
}








