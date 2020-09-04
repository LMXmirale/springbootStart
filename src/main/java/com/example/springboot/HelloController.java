package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : pp
 * @Date : 2020/9/2 19:45
 */
@RestController
public class HelloController {

  /*  @Value("${name}")
    private String name;

    @Value("${url}")
    private String url;*/

    @Autowired
    private Author author;

 /*   @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        // return "Hello springboot";
        return name + url;
    }*/

    @RequestMapping("/hi")
    public String hi() {
        return "name ------------>" + author.getName() + "===========" + "url------------->" + author.getUrl();
    }
}
