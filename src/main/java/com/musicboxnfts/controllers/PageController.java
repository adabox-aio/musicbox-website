package com.musicboxnfts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @Autowired
    public PageController() {}

    @GetMapping({"/","/index","/home"})
    public String index() {
        return "index";
    }

}
