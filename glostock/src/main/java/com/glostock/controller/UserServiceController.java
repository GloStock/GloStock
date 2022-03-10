package com.glostock.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

			session.setAttribute("user_email", vo.getEmail());
			session.setAttribute("user_password", vo.getPassword());

			return "redirect:/user/feed"; 
		
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
		
		return "user/service#first";
		
	} 
	
	@RequestMapping("divForm") //배당률계산기
	public String divForm(Model model, CalVO vo) {  
	
		
		model.addAttribute("divForm", vo);
		
		return "user/service#second";
		
	} 
	
	@RequestMapping("compoundForm") //복리수익률계산기
	public String compoundForm(Model model, CalVO vo) {  
		
		
		model.addAttribute("compoundForm", vo);
		
		return "user/service#third";
		
	} 

	
	@RequestMapping("/crypto")
	public String crypto() {
		return "user/crypto";
	}
	
	//마이페이지
	@RequestMapping("/mypage")
	public String mypage(HttpSession session, Model model) {
	//세션없을경우 접근불가
		if (session.getAttribute("user_email")==null) { 
		return "redirect:/user/login"; }
		
		else { 
			session.getAttribute("user_email");
			session.getAttribute("user_password");
			String user_email= (String)session.getAttribute("user_email");
			
			
			UserVO vo=service.mypage(user_email);
			model.addAttribute("mypage", vo);
		
		return "user/mypage";
		}
	}
	
	@RequestMapping("/update")
	public String update(HttpSession session, Model model) {
		
		if (session.getAttribute("user_email")==null) { 
			return "redirect:/user/login"; }
			
			else { 
				session.getAttribute("user_email");
				session.getAttribute("user_password");
				String user_email= (String)session.getAttribute("user_email");
				
				UserVO vo=service.mypage(user_email);
				model.addAttribute("mypage", vo);
	
		
		return "user/update"; 
		}
	}
	
	@RequestMapping("/myinfo")
	public String myinfo(HttpSession session, Model model) {
		
		if (session.getAttribute("user_email")==null) { 
			return "redirect:/user/login"; }
			
			else { 
				session.getAttribute("user_email");
				session.getAttribute("user_password");
				String user_email= (String)session.getAttribute("user_email");
				
				UserVO vo=service.mypage(user_email);
				model.addAttribute("mypage", vo);
		
		
		return "user/myinfo"; }
	}
	
	
	
	
	//내정보수정
	@RequestMapping("updateForm")
	public String updateform(HttpSession session, Model model, UserVO vo) {
		if (session.getAttribute("user_email")==null) { 
			return "redirect:/user/login"; } 
		else { 
		service.update(vo);
		
	
		model.addAttribute("mypage", vo); 
		
		
		return "redirect:/user/myinfo";
		}
	}
	
	@RequestMapping("/passwordupdate")
	public String passwordupdate(HttpSession session, Model model) {
		
		if (session.getAttribute("user_email")==null) { 
			return "redirect:/user/login"; }
			
			else { 
				session.getAttribute("user_email");
				session.getAttribute("user_password");
				String user_password= (String)session.getAttribute("user_password");
				
				UserVO vo=service.mypage(user_password);
				model.addAttribute("mypage", vo);

		return "user/passwordupdate"; }
	}
	
	//비밀번호수정
		@RequestMapping("passwordUpdate")
		public String passwordUpdate(HttpSession session, Model model, @RequestParam ("newpassword") String newpassword )  {
			if (session.getAttribute("user_email")==null) { 
				return "redirect:/user/login"; } 
			else { 
				UserVO vo= new UserVO(); 
				vo.setNewpassword(newpassword);
				
				service.passwordchange(vo);
			
		
			
			return "redirect:/user/mypage";
			}
		}

	
	//로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session) {  
		session.removeAttribute("user_email");
		session.removeAttribute("user_password");

		session.invalidate(); 
		
		return "redirect:/"; 
	}
	
	
	
	
	
	@RequestMapping("/portfolio_result")
	public String portfolio_result() {
		return "user/portfolio_result";
	}


}
