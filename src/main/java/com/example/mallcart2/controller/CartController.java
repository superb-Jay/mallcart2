package com.example.mallcart2.controller;


import com.example.mallcart2.dto.CartResponseDTO;
import com.example.mallcart2.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public List<CartResponseDTO> selectCart() {
        return cartService.selectCart();
    }



}
