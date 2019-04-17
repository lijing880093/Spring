package com.java.controller;

import com.java.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Iman
 * date   : 2019/4/17
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static List<User> list=new ArrayList<>();
    static {
        list.add(new User(1,"aaaaa","aaaaaaa"));
        list.add(new User(2,"bbbbb","bbbbbbb"));
        list.add(new User(3,"ccccc","ccccccc"));
    }

    @RequestMapping("/list")
    public String queryAll(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("list",list);
        return "/user/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(name = "id") Integer id){
        User u=new User();
        for (User user:list) {
            if(id.equals(user.getId())){
                u=user;
                break;
            }
        }
        list.remove(u);
        return "redirect:/user/list";

    }
    @RequestMapping(value = "/toadd")
    public String queryOne(){
        return "forward:/WEB-INF/views/user/update.jsp";
    }
    @RequestMapping(value = "/toupdate/{id}")
    public ModelAndView toupdate(@PathVariable(name = "id") Integer id){

        User u=null;
        for (User user:list) {
            if(user.getId().equals(id)){
                u=user;
                break;
            }
        }
        ModelAndView modelAndView=new ModelAndView("/user/update");
        modelAndView.addObject("u",u);

        return modelAndView;
    }
    @RequestMapping(value = "/save")
    public String save(User user){

        int i = list.get(list.size() - 1).getId() + 1;
        if(user.getId()==null){
            user.setId(i);
            list.add(user);
        }else{
            int index=-1;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getId().equals(user.getId())){
                    index=j;
                }
            }
            if(index!=-1) {
                list.set(index, user);
            }
        }
        return "redirect:/user/list";
    }
}
