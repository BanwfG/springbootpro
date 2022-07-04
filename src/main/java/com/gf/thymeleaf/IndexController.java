package com.gf.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public String details(Model model){
        return "/404";
    }

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @GetMapping("/tologin")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password){
        System.out.println("username:" +username);
        System.out.println("password:" +password);
        if("admin".equals(username) && "12345".equals(password)){
            return "redirect:/index";
        }else{
            return "redirect:/details";
        }
    }
}
