package com.accp.dao;

import org.apache.ibatis.annotations.Param;


import com.accp.pojo.*;

public interface UserDao {
	public Integer Login(@Param("username")String username,@Param("userpwd")String userpwd);
}
