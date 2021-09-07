package com.example.animal_shop.Service;

import java.util.List;

import com.example.animal_shop.Dao.ShohinMstRepository;
import com.example.animal_shop.Entity.ShohinMstEntity;

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
}
