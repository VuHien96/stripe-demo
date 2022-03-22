package com.example.ecommercebackend.service;

import com.example.ecommercebackend.model.dto.PaymentInfo;
import com.example.ecommercebackend.model.dto.Purchase;
import com.example.ecommercebackend.model.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.stereotype.Service;

@Service
public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
