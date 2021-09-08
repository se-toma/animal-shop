package com.example.animal_shop.Controller;

import java.util.List;

import com.example.animal_shop.Entity.ShohinMstEntity;
import com.example.animal_shop.Form.ProductMasterForm;
import com.example.animal_shop.Service.ProductMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    private ModelAndView init(@ModelAttribute ProductMasterForm productMasterForm){
        ModelAndView mav = new ModelAndView();
        // ProductMasterServiceを呼びでして、商品の一覧を取得する
        List<ShohinMstEntity> shohinMstList = productMasterService.getProduct();
        // Formにつめる
        productMasterForm.setShohinMstEntityList(shohinMstList);
        // Formを画面に返却するオブジェクトにつめる
        mav.addObject("productMasterForm", productMasterForm);
        mav.setViewName("product_master.html");
        return mav;
    }

    @RequestMapping("/product-input")
    @ResponseBody
    private ModelAndView input(@ModelAttribute ProductMasterForm productMasterForm){
        // 渡されたデータを登録する
        productMasterService.insert(productMasterForm);
        // formのインプット要素を初期化する
        productMasterForm.setProductName("");
        productMasterForm.setPrice(null);
        return this.init(productMasterForm);
    }
}
