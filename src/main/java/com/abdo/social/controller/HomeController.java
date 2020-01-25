package com.abdo.social.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping(value="/")
//	public ModelAndView test(HttpServletResponse response) throws IOException{
//		return new ModelAndView("home");
//	}
	
	@GetMapping("/")
	public String test(HttpServletResponse response) throws IOException{
		return "home/home";
	}
}
