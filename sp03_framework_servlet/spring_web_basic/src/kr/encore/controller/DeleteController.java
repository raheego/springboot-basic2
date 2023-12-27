package kr.encore.controller;

import kr.encore.model.DeptDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DeleteController {
    @Autowired
    private DeptDAO deptDao;   // DB연결 관련

    @RequestMapping("/delete.do")
    public String delete(Model model, HttpServletRequest request) {
        int num = Integer.parseInt(request.getParameter("deptno"));
        deptDao.deleteDept(num);


        return "redirect:list.do";   //    /WEB-INF/views/list.jsp
    }

}
