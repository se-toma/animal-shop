package com.example.animal_shop.Service;

import java.util.List;

import com.example.animal_shop.Dao.ShohinMstRepository;
import com.example.animal_shop.Entity.ShohinMstEntity;
import com.example.animal_shop.Form.ProductMasterForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductMasterService {
    @Autowired
    ShohinMstRepository shohinMstRepository;
    
    public List<ShohinMstEntity> getProduct() {
        return shohinMstRepository.selectAll();
    }

    public int insert(ProductMasterForm form) {
        ShohinMstEntity shohinMstEntity = new ShohinMstEntity();
        shohinMstEntity.shohinName = form.getProductName();
        shohinMstEntity.shohinPrice = form.getPrice();
        return shohinMstRepository.insert(shohinMstEntity);
    }


}
