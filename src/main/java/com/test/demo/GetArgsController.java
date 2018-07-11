package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetArgsController {
    @Autowired
    private ApplicationArguments applicationArguments;

    @RequestMapping("/args")
    @ResponseBody
    public String test(){
        System.out.println(applicationArguments.getNonOptionArgs());
        return "java";
    }
}
