package com.glostock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
public class UserServiceController {

	//로그인페이지
	@RequestMapping("/login")
	public String login() { 
		return "user/login"; 
	}
	
	@RequestMapping("/join")
	public String join() {  
		return "user/join";
	}

	@RequestMapping("/feed")
	public String feed() {
		return "user/feed";
	}

	@RequestMapping("/follow")
	public String follow() {
		return "user/follow";
	}

	@RequestMapping("/write")
	public String write() {
		return "user/write";
	}

	@RequestMapping("/portfolio")
	public String portfolio() {
		return "user/portfolio";
	}
	
	@RequestMapping("/service")
	public String service() {
		return "user/service";
	}

	@RequestMapping("/crypto")
	public String crypto() {
		return "user/crypto";
	}
	
	@RequestMapping("/mypage")
	public String mypage() {
		return "user/mypage";
	}
<<<<<<< HEAD
	
	@RequestMapping("/calculator") 
	public String calculator() {  
		return "user/calculator"; 
		
	} 
	
=======
>>>>>>> 791a1d9bfd56e413aa20a34eaac05fb9901b672b

}
