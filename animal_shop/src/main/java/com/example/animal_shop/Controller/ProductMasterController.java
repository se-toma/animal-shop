package com.example.animal_shop.Controller;

import java.util.List;

import com.example.animal_shop.Entity.ShohinMstEntity;
import com.example.animal_shop.Service.ProductMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@EnableAutoConfiguration
public class ProductMasterController {

    @Autowired
    ProductMasterService productMasterService;

    @RequestMapping("/product-master")
    @ResponseBody
    private ModelAndView init(){
        ModelAndView mav = new ModelAndView();
        List<ShohinMstEntity> shohinMstList = productMasterService.getProduct();
        mav.setViewName("product_master.html");
        return mav;
    }
}
