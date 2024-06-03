package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class mainContorller {

	@GetMapping("/test")
	public String goIndex() {
        System.out.println("진입");
//        log.info("진입");
		return "/main/main";
	}
	
	@GetMapping("/main")
	public String goMain() {
        System.out.println("진입");
//        log.info("진입");
		return "/main/main";
	}
	
	@GetMapping("/head")
	public String headTest() {
		System.out.println("헤더진입");
		return "/views/header";
	}
	@GetMapping("/login")
	public String login() {
		return "/login/login";
	}
}
