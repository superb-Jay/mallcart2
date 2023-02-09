package com.example.mallcart2.service.impl;

import com.example.mallcart2.dto.CartAmountRequest;
import com.example.mallcart2.dto.CartDeleteRequestDTO;
import com.example.mallcart2.dto.CartResponseDTO;
import com.example.mallcart2.entity.Cart;
import com.example.mallcart2.repository.CartRepository;
import com.example.mallcart2.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    @Override
    public String deleteCart(CartDeleteRequestDTO cartDeleteRequestDTO) {

        try {
            cartRepository.delete(cartDeleteRequestDTO.toEntity());
        } catch (Exception e) {
            return "failed";
        }

        return "success";
    }

    @Override
    public String amountCart(CartAmountRequest amountRequest) {

        Optional<Cart> optional = cartRepository.findById((long) amountRequest.getId());


        try {

            Cart cartFound = optional.get();
            if (amountRequest.getAct().equals("plus")) {
                cartFound.setAmount(cartFound.getAmount() + 1);
                cartRepository.save(cartFound);
            } else {
                if (cartFound.getAmount() > 1) {
                    cartFound.setAmount(cartFound.getAmount() - 1);
                    cartRepository.save(cartFound);
                }
            }
        } catch (Exception e) {
            return "failed";
        }

        return "success";
    }


}
