package com.book.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {

    @RequestMapping("/")
    public String getIndexPage() {
        return "view/index";
    }

}
