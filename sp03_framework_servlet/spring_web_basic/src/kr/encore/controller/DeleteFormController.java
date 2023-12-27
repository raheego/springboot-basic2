package kr.encore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DeleteFormController {
@RequestMapping("/deleteform.do")
    public String deletFrom(Model model){
        return "deleteform";
    }
}
