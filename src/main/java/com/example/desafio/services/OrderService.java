package com.example.desafio.services;

import com.example.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - order.getBasic() * order.getDiscount() / 100 + shippingService.shipment(order);
    }
}