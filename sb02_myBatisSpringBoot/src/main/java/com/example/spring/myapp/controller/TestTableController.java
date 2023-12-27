package com.example.spring.myapp.controller;

import com.example.sping.domain.TableVO;
import com.example.spring.myapp.service.TestTableService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
/*
@RestController
public class TestTableController {
	
	@Resource
	private TestTableService testtableService;
	
	@RequestMapping(value="list")
	public ModelAndView AllListView() throws Exception{
		ModelAndView mav = new ModelAndView();
		
		List<TableVO> AllList = testtableService.selectAllList();
		System.out.println(AllList);
		
		
		mav.addObject("Alllist", AllList);
		mav.setViewName("list");
		return mav;
	}
	
	
	@RequestMapping(value="insert")
	public void insert(TableVO tableVO) throws Exception{
		tableVO = new TableVO(1111,"1234");
		
		testtableService.insert(tableVO);
	
	}
	
	@RequestMapping(value="delete")
	public void deleteByUserCode() throws Exception{
		testtableService.deleteByUserCode(1111);
	
	}
	
}
*/

//*

@RestController
public class TestTableController {

	@Resource
	private TestTableService testTableService;

	@GetMapping(value="/sign-up")
	public ModelAndView signupForm(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("signup");

		return mav;

	}
	@PostMapping(value = "/sign-up")
	public ModelAndView signup(TableVO vo) throws Exception {
		ModelAndView mav = new ModelAndView();

		testTableService.insert(vo);
		mav.addObject("vo",vo);
		mav.setViewName("insert");

		return mav;
	}
	@GetMapping(value = "/insert")
	public TableVO selectByUserCode() throws Exception {

		ModelAndView mav = new ModelAndView();

		TableVO testTable = testTableService.selectByUserCode(1234);
		System.out.println(testTable);

		return testTable;
	}

	@RequestMapping(value="list")
	public ModelAndView AllListView() throws Exception{
		ModelAndView mav = new ModelAndView();

		List<TableVO> AllList = testTableService.selectAllList();
		System.out.println(AllList);


		mav.addObject("Alllist", AllList);
		mav.setViewName("list");
		return mav;
	}


	@RequestMapping(value="insert")
	public void insert(TableVO tableVO) throws Exception{
		tableVO = new TableVO(1111,"1234");

		testTableService.insert(tableVO);

	}


	@RequestMapping(value="delete")
//	@GetMapping(value = "/delete")
	public ModelAndView deleteByUserCode() throws Exception{
		ModelAndView mav = new ModelAndView();

		int result =testTableService.deleteByUserCode(33);
		System.out.println("삭제 되었습니다.");

		mav.setViewName("list");
		return mav;
	}

	@GetMapping(value = "/deleteform")
	public ModelAndView deleteForm() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("deleteForm");

		return mav;
	}

	@PostMapping(value = "/deleteform")
	public ModelAndView delete(int userCode) throws Exception {

		ModelAndView mav = new ModelAndView();

		testTableService.delete(userCode);

		mav.addObject("userCode", userCode);
		mav.setViewName("deleteForm");

		return mav;
	}

	@GetMapping("/updateform")
	public ModelAndView updateForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateForm");
		return mav;
	}

	@PostMapping("/update")
	public ModelAndView update(TableVO vo) throws Exception {
		ModelAndView mav = new ModelAndView();
		testTableService.update(vo);
		mav.addObject("vo", vo);
		mav.setViewName("signup");
		return mav;
	}

}

/*
ModelAndView : data save, view page move
Model : data save
 */