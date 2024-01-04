package com.encore.kakaosearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class MainController {
	
	@GetMapping("/main")//http://localhost:8080/api/main
	public ModelAndView main() {
		return new ModelAndView("main");
	}
}
