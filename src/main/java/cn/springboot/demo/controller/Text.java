package cn.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 朕
 * @date 2019-01-09    21:41
 */
@Controller
public class Text {

    @RequestMapping("text")
    @ResponseBody
    public String text(){
        return "这个是测试";
    }

}
