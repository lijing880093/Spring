package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Iman
 * date   : 2019/4/17
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/helloworld")
    public String hello(Model model){

        model.addAttribute("helloMsg","SpringMVC你好，很高兴认识你!!!");

        return "hello";
    }


}
