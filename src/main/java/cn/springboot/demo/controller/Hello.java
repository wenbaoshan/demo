package cn.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 朕
 * @date 2019-01-09    21:33
 */
@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "Hello.html";
    }

}
