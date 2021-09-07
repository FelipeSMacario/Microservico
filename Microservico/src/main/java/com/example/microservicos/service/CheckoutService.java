package com.example.microservicos.service;

import com.example.microservicos.entity.CheckoutEntity;
import com.example.microservicos.resource.checkout.CheckoutRequest;

import java.util.Optional;
public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
