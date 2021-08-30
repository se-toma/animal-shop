package com.example.animal_shop.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@EnableAutoConfiguration
public class RegisterController {
    @RequestMapping("/register-input")
    @ResponseBody
    private ModelAndView init(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register_input.html");
        return mav;
    }

    @RequestMapping("/register-confirm")
    @ResponseBody
    private ModelAndView register(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register_confirm.html");
        return mav;
    }
}
