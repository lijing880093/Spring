package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Iman
 * date   : 2019/4/17
 */
@Controller
@RequestMapping("list")
public class List {
    @RequestMapping("toadd")
    public String toadd(){
        System.out.println("add........");
        return "add";
    }
    @RequestMapping("add")
    public String add(User user){
        System.out.println("add........"+user);
        return "add";
    }
}
