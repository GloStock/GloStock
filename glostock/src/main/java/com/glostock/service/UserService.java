package com.glostock.service;

import com.glostock.model.UserVO;

public interface UserService {

	public int join(UserVO vo); //회원가입
	public int login(UserVO vo); //회원로그인
	
	
	
	
}
