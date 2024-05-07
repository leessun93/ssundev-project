package com.example.demo.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.UserVo.UserVo;

@Controller
@RequestMapping("/login")
public class LoginController {

	@PostMapping("/login")
	public String Login(@ModelAttribute("UserLogin") UserVo userVo, 
						@RequestBody String textUserVo ) {
		System.out.println("로긴성공");
		System.out.println(textUserVo);
		/*
		System.out.println(userVo.getUserId());
		System.out.println(userVo.getUserPassword());*/
		
		
		

		return "redirect:/main";
	}
}
