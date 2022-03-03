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
<<<<<<< HEAD
	
	@RequestMapping("/mypage")
	public String mypage() {
		return "user/mypage";
	}
	
=======
>>>>>>> cb6f517f56d3f5ce13d40e5e94482f55c7c6e522
}
