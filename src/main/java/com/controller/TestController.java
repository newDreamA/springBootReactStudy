package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by txw on 16/2/23.
 */
@Controller
public class TestController {
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String getIndex(){
            return "index";
        }

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String getTest(){
        return "test";
    }

    @RequestMapping(value="/helloWorld",method = RequestMethod.GET)
    public String getHelloWorld(){
        return "helloWorld";
    }
    @RequestMapping(value="/comment",method = RequestMethod.GET)
    public String getComment(){
        return "comment";
    }
}


