package com.example.animal_shop.Entity;
 
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
 
@Entity
@Table(name = "shohin_mst")
public class ShohinMstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequence = "shohin_id_seq")
    @Column(name = "shohin_id")
    public Integer shohinId;
    
    @Column(name = "shohin_name")
    public String shohinName;

    @Column(name = "shohin_price")
    public Integer shohinPrice;
}