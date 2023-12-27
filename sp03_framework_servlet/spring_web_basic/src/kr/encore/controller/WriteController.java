package kr.encore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.encore.model.DeptDAO;
import kr.encore.model.DeptDTO;

import java.sql.SQLException;

@Controller
public class WriteController { 
	
	@Autowired
	private DeptDAO deptDAO;   // DB 연결 관련 

	@RequestMapping("/write.do")
	public String write(Model model, HttpServletRequest request) throws SQLException {
		
//		request.setCharacterEncoding("utf-8");
		
		int no = Integer.parseInt(request.getParameter("deptno"));
		String name = request.getParameter("deptname");
		String loc = request.getParameter("deptloc");
		System.out.println(no + "/ " + name + "/ " + loc);
		
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(no);
		dto.setDname(name);
		dto.setLoc(loc);

		
		deptDAO.insertDept(dto);

		
		return "redirect:list.do";
	}

}

//public class WriteController  implements Controller {  // controller
//	
//	@Autowired
//	private DeptDAO deptDAO;   // DB 연결 관련 
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, 
//			HttpServletResponse response) throws Exception {
//		
//		int no = Integer.parseInt(request.getParameter("deptno"));
//		String name = request.getParameter("deptname");
//		String loc = request.getParameter("deptloc");
//		System.out.println(no + "/ " + name + "/ " + loc);
//		
//		ModelAndView mav = new ModelAndView();  // 저장, 뷰페이지 지정
//		mav.addObject("no", no);   // 데이터 저장
//		mav.addObject("name", name);
//		mav.addObject("loc", loc);
//		
//		mav.setViewName("list");  // 이동할 뷰페이지 지정
//		
//		
//		return mav;
//	}
//
//}
