package com.example.activedirectory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView home(ModelAndView modelAndView) {
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping(value = "/teste")
    public ModelAndView teste(ModelAndView modelAndView, HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getRemoteUser());
        System.out.println(httpServletRequest.getRemoteHost());
        System.out.println(httpServletRequest.getRemoteAddr());
        modelAndView.setViewName("home");
        return modelAndView;
    }

}