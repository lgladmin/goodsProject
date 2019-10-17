package com.accp.biz;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.*;
import com.accp.pojo.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class GoodsBiz {
	
	@Autowired
	private GoodsDao dao;
	
	/*@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)*/
	public PageInfo<Goods> queryByPage(Integer pagenum,Integer pagesize){
		PageHelper.startPage(pagenum, pagesize);
		return new PageInfo<Goods>(dao.queryAll());
	}
	
	public Goods queryOne(Integer gid) {
		return dao.queryOne(gid);
	}
	
	public Integer updateGoods(Goods goods) {
		return dao.updateGoods(goods);
	}
	
	public Integer deleteGoods(Integer gid) {
		return dao.deleteGoods(gid);
	}
	
	public Integer insertGoods(Goods goods) {
		return dao.insertGoods(goods);
	}
}
