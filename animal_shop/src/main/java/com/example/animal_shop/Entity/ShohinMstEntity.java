package com.example.animal_shop.Entity;
 
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
 
@Entity
public class ShohinMstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shohin_id")
    public Integer shohinId;
    
    @Column(name = "shohin_name")
    public String shohinName;

    @Column(name = "shohin_price")
    public Integer shohinPrice;
}