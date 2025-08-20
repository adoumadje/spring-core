package com.adoumadje.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimitivesController {
    @RequestMapping("/readPrimitives")
    public ModelAndView readPrimitives() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("readPrimitives");

        modelAndView.addObject("id", 123);
        modelAndView.addObject("name", "Oligui Nguema");
        modelAndView.addObject("salary", 10_000);

        return modelAndView;
    }
}
