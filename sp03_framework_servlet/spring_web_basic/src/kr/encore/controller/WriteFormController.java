package kr.encore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WriteFormController {

	@RequestMapping("/writeform.do")
	public String writeForm(Model model) {
		
		return "writeform";   //    /WEB-INF/views/ + writeform + .jsp
	}
}
