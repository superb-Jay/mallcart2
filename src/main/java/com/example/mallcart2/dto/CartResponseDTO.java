package com.example.mallcart2.dto;


import com.example.mallcart2.entity.Cart;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CartResponseDTO {

    private Long cartId;
    private int amount;

    private Long proId;
    private String intro;
    private String contents;
    private String image;
    private String color;
    private String size;
    private int price;

    public CartResponseDTO(Cart cart) {
        this.cartId = cart.getId();
        this.proId = cart.getProduct().getId();
        this.amount = cart.getAmount();
        this.intro = cart.getProduct().getIntro();
        this.contents = cart.getProduct().getContents();
        this.image = cart.getProduct().getImage();
        this.color = cart.getProduct().getColor();
        this.size = cart.getProduct().getSize();
        this.price = cart.getProduct().getPrice();
    }
}
