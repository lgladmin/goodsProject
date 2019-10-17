package com.accp.dao;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.*;

public interface GoodsDao {
	public List<Goods> queryAll();
	
	public Goods queryOne(@Param("gid")Integer gid);
	
	public Integer updateGoods(@Param("goods")Goods goods);
	
	public Integer deleteGoods(@Param("gid")Integer gid);
	
	public Integer insertGoods(@Param("goods")Goods goods);
}
