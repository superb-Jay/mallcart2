package com.example.mallcart2.service;

import com.example.mallcart2.dto.CartResponseDTO;

import java.util.List;

public interface CartService {

    public List<CartResponseDTO> selectCart();


}
