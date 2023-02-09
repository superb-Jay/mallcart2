package com.example.mallcart2.service;

import com.example.mallcart2.dto.CartAmountRequest;
import com.example.mallcart2.dto.CartDeleteRequestDTO;
import com.example.mallcart2.dto.CartResponseDTO;

import java.util.List;

public interface CartService {

    public List<CartResponseDTO> selectCart();
    public String deleteCart(CartDeleteRequestDTO cartDeleteRequestDTO);
    public String amountCart(CartAmountRequest amountRequest);


}
