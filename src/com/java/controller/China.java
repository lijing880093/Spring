package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Iman
 * date   : 2019/4/17
 */
@Controller
@RequestMapping("china")
public class China {
    @RequestMapping("query/{id}")
    public String queryById(@PathVariable(name = "id") String id){
        System.out.println("id======"+id);
        return "success";


    }
}
