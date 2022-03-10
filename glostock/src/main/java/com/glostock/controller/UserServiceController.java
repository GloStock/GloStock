package com.glostock.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.glostock.command.CalVO;
import com.glostock.model.UserVO;
import com.glostock.service.UserService;


@Controller
@RequestMapping("/user/*")
public class UserServiceController {

@Autowired
private UserService service;
	
	//로그인페이지
	@RequestMapping("/login")
	public String login() { 
		return "user/login"; 
	}
	
	//로그인폼
	@RequestMapping("/loginForm")
	public String loginForm(UserVO vo, 
			HttpSession session,
			RedirectAttributes RA) {
		
		int result= service.login(vo);
		
		if (result==1) {//로그인성공(세션생성)
			session.setAttribute("user_id", vo.getNickname());
			return "redirect:/"; 
		
		} else { //로그인 실패 
			RA.addFlashAttribute("msg","아이디 비밀번호를 확인하세요");
			return "redirect:/user/login";
			
		} 
		
		
		
	}  
	
	
	
	@RequestMapping("/join")
	public String join() {  
		return "user/join";
	}

	@RequestMapping("/joinForm")
	public String joinForm(UserVO vo, 
			RedirectAttributes RA ) {  
	
		//서비스로 join을 처리해야함.
		int result = service.join(vo);
	
		if(result==1) {  //1반환시 성공 
			RA.addFlashAttribute("msg","회원가입에 성공했습니다.");
			return "redirect:/user/join_result";  
			
		} else { 		//insert 실패 
			RA.addFlashAttribute("msg","회원가입에 실패했습니다.");
			return "redirect:/user/join"; 
		}
		
		

	}
	
	@RequestMapping("/join_result")
	public String join_result() { 
	
		
		return "user/join_result";
		
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
		
		
		model.addAttribute("compoundForm", vo);
		
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
