package com.abc.hellospringdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {


@RequestMapping("/")
public String index(){
    return "hello";
}
    
}
