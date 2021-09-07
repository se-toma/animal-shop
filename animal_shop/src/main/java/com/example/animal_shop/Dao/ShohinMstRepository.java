package com.example.animal_shop.Dao;

import java.util.List;

import com.example.animal_shop.Entity.ShohinMstEntity;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

@ConfigAutowireable
@Dao
public interface ShohinMstRepository {
    @Select
    List<ShohinMstEntity> selectAll();

    @Insert
    @Transactional
    int insert(ShohinMstEntity shohinMstEntity);
}
