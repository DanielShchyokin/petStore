package com.colinma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/pet", "/pet/*"})
public class ApplicationController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "forward:/index.html";
    }
}
