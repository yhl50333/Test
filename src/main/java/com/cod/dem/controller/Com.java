package com.cod.dem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Com {

    @RequestMapping("/c")
    public String c(){
        System.out.println(1);
        return "C";
    }
    @RequestMapping("/s")
    @ResponseBody //将方法返回值以字符串形式进行输出
    public String doAjaxGet() throws Exception{
        System.out.println("==doGet()==");
        //Thread.sleep(3000);//模拟耗时操作
        return "Ajax Get request result";
    }
}
