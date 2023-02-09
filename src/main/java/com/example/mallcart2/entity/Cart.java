package com.example.mallcart2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "prac_cart")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private int amount;

    @ManyToOne(targetEntity = Product.class, fetch = FetchType.EAGER ) // 여러개의 카트가 1개의 상품을 가르친다.
    @JoinColumn(name = "pro_id")
    private Product product;


}
