package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import com.accp.dao.UserDao;
import com.accp.pojo.*;
import com.accp.util.*;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {
	
	@Autowired
	private UserDao dao;
	
	/*@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)*/
	public Integer login(String username,String userpwd){
		return dao.Login(username, userpwd);
	}
}










