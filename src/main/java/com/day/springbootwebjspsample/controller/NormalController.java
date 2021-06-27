package com.day.springbootwebjspsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {

	@RequestMapping("/hot-fix")
	public String index(){
		System.out.println("hot-fix");
		return "hot-fix";
	}
}
