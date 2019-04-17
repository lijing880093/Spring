package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: Iman
 * date   : 2019/4/17
 */
@Controller
@RequestMapping("/model")
public class Model {
    @RequestMapping("/query")
    public ModelAndView queryModel(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg","model方法");
        modelAndView.setViewName("model");
        return modelAndView;
    }
    @RequestMapping(value="testParamaAndHeaders",params={"username","age!=10"})
    public String testParamaAndHeaders(@RequestParam(name = "username") String username){
        System.out.println("testParamaAndHeaders");
        System.out.println(username);
        return "success";
    }

    @RequestMapping(value="testParama")
    public String testParama(@RequestParam(name = "username",required = false) String username){
        System.out.println("testParamaAndHeaders");
        System.out.println(username);
        return "success";
    }

    @RequestMapping(value="test/*/aaa")
    public String test(){
        System.out.println("testParamaAndHeaders");
        return "success";
    }

}
