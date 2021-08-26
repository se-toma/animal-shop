package com.example.animal_shop;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class Helloworld {
    @RequestMapping("/hello")
    @ResponseBody
    private String hello(){
        return "Hello World!";
    }
}