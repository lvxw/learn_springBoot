package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MyDatasourceController {

    @Autowired
    private MyDatasource datasource;

    @RequestMapping("/datasource")
    @ResponseBody
    public  String datasource(){
        System.out.println(datasource);
        return "datasource";
    }

}
