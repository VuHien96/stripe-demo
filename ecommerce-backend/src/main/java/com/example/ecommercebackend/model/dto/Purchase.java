package com.example.ecommercebackend.model.dto;


import com.example.ecommercebackend.entity.Address;
import com.example.ecommercebackend.entity.Customer;
import com.example.ecommercebackend.entity.Order;
import com.example.ecommercebackend.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
