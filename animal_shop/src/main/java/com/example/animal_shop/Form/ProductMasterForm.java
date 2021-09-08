package com.example.animal_shop.Form;

import java.util.List;

import com.example.animal_shop.Entity.ShohinMstEntity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductMasterForm {

    // 商品名
    private String productName;

    // 価格
    private Integer price;

    // 商品マスタリスト
    private List<ShohinMstEntity> shohinMstEntityList;
}
