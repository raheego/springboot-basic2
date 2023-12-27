package com.example.demo.day2.controller;

import com.example.demo.day2.domain.TableVo;
import com.example.demo.day2.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping()
public class TestTableController {
    @Autowired
    private TestTableService testTableService;

    @RequestMapping(value="list")
//    public String AllListView(Model model) throws Exception{  // Model : data save
    public ModelAndView AllListView() throws Exception{
        ModelAndView mav = new ModelAndView();

        List<TableVo> AllList = testTableService.selectAllList();
        System.out.println(AllList);

//        model.addAttribute("Alllist",AllList);
        mav.addObject("Alllist", AllList);  //data save
        mav.setViewName("list"); // view page move
        return mav;
    }

    @RequestMapping(value="insert")
    public void insert(TableVo tableVO) throws Exception{
        tableVO = new TableVo(1111,"1234");

        testTableService.insert(tableVO);

    }

    @RequestMapping(value="delete")
    public void deleteByUserCode() throws Exception{
        testTableService.deleteByUserCode(1111);

    }

    @GetMapping(value="/sign-up")
    public ModelAndView signupForm(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("signup");

        return mav;

    }
    @PostMapping(value = "/sign-up")
    public ModelAndView signup(TableVo vo) throws Exception {
        ModelAndView mav = new ModelAndView();

        testTableService.insert(vo);
        mav.addObject("vo",vo);
        mav.setViewName("insert");

        return mav;
    }
}

/*
ModelAndView : data save, view page move
Model : data save
 */