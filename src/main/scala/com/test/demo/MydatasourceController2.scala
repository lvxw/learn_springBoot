package com.test.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

@Controller
class MydatasourceController2 {

  @Autowired
  var druidDatasource:MyDruidDatasource = _

  @RequestMapping(Array("/datasource2"))
  @ResponseBody
  def datasource2():String={
    println(druidDatasource.username)
    println(druidDatasource.password)
    println(druidDatasource.url)
    println(druidDatasource.driverClassName)
    "datasource2"
  }
}
