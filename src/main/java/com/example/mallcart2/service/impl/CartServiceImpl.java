package com.example.mallcart2.service.impl;

import com.example.mallcart2.dto.CartResponseDTO;
import com.example.mallcart2.entity.Cart;
import com.example.mallcart2.repository.CartRepository;
import com.example.mallcart2.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {


    private final CartRepository cartRepository;

    @Override
    public List<CartResponseDTO> selectCart() {

        List<Cart> cartList = cartRepository.findAll();

        return cartList.stream()
                .map(CartResponseDTO::new)
                .collect(Collectors.toList());

    }
}
