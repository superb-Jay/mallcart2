package com.example.mallcart2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "prac_product")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "intro" )
    private String intro;

    @Column(name = "contents" )
    private String contents;

    @Column(name = "image" )
    private String image;

    @Column(name = "size" )
    private String size;

    @Column(name = "color" )
    private String color;

    @Column(name = "price" )
    private int price;


}
