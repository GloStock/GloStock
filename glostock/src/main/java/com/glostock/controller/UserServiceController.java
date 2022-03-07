package com.glostock.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glostock.command.CalVO;


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
	
	@RequestMapping("/service") //계산기 유저서비스 화면
	public String service() {
		return "user/service";	
	}

	@RequestMapping("ipoForm") //공모주계산기
	public String ipoForm(Model model, CalVO vo) {  
		
		
		model.addAttribute("ipoForm", vo);
		
		return "user/service";
		
	} 
	
	@RequestMapping("divForm") //배당률계산기
	public String divForm(Model model, CalVO vo) {  
	
		
		model.addAttribute("divForm", vo);
		
		return "user/service";
		
	} 
	
	@RequestMapping("compoundForm") //복리수익률계산기
	public String compoundForm(Model model, CalVO vo) {  
		
		
		model.addAttribute("compoindForm", vo);
		
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

	
	
	
	
	
	
	
	
	@RequestMapping("/portfolio_result")
	public String portfolio_result() {
		return "user/portfolio_result";
	}


}
