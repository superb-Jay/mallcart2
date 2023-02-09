package com.example.mallcart2.dto;


import com.example.mallcart2.entity.Cart;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CartDeleteRequestDTO {

    private String id;

    public Cart toEntity() {
        return Cart.builder()
                .id(Long.valueOf(this.id))
                .build();
    }

}
