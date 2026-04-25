package com.example.SpringBootWeb1.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public  class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("here");
        return "index";
    }

//    @RequestMapping("/addAlien")
//    public ModelAndView add(/*HttpServletRequest req*/@RequestParam("aid") int num, String aname, ModelAndView mv /*HttpSession session*/ /*Model model*/){
////        int num1 = Integer.parseInt(req.getParameter("num1"));
////        int num2 = Integer.parseInt(req.getParameter("num2"));
////        int result = num+num2;
//        Alien alien = new Alien();
//        alien.setAid(num);
//        alien.setAname(aname);
//
////        model.addAttribute("result", result);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//        return mv;
//    }
    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute("alien1") Alien alien){//@ModelAttribute is optional only required when we want to provide different name
        return "result";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }
}