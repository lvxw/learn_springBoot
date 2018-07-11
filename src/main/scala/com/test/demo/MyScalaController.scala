package com.test.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

@Controller
class MyScalaController {

  @RequestMapping(Array("/scala","/scala2"))
  @ResponseBody
  def test2():String={
    return "scala"
  }
}
