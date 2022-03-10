package com.glostock.mapper;

import com.glostock.model.UserVO;

public interface UserMapper {

	public int join(UserVO vo);//회원가입
	public int login(UserVO vo);//로그인
	
	
}
