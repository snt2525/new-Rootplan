package com.namhee.rootplan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/main")
    public ModelAndView mainPage(ModelAndView mav){
        mav.setViewName("main");
        return mav;
    }
}
