package com.glostock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glostock.mapper.UserMapper;
import com.glostock.model.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper; 
	
	
	@Override 
	public int join(UserVO vo) {
		
		int result=mapper.join(vo);
	
	
		return result;
	}
	
	
	@Override
	public int login(UserVO vo) {
		int result= mapper.login(vo);
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
}
