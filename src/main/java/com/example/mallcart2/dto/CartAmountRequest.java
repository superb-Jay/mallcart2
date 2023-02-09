package com.example.mallcart2.dto;

import com.example.mallcart2.entity.Cart;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CartAmountRequest {

    private int id;
    private String act;

    public Cart toEntity() {
        return Cart.builder()
                .id(Long.valueOf(this.id))
                .build();
    }
}
