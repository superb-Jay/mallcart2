package com.example.mallcart2.controller;


import com.example.mallcart2.dto.CartAmountRequest;
import com.example.mallcart2.dto.CartDeleteRequestDTO;
import com.example.mallcart2.dto.CartResponseDTO;
import com.example.mallcart2.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public List<CartResponseDTO> selectCart() {
        return cartService.selectCart();
    }

    @DeleteMapping("/cart")
    public String deleteCart(CartDeleteRequestDTO cartDeleteRequestDTO) {
        return cartService.deleteCart(cartDeleteRequestDTO);
    }


    @PatchMapping("/cart/amount")
    public String amountCart(CartAmountRequest cartAmountRequest) {
        return cartService.amountCart(cartAmountRequest);
    }


}
