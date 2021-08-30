package com.example.animal_shop.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@EnableAutoConfiguration
public class TodaysSalesController {
    @RequestMapping("/todays-sales")
    @ResponseBody
    private ModelAndView init(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("todays_sales.html");
        return mav;
    }
}
