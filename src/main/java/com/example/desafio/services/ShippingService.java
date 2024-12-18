package com.example.desafio.services;

import com.example.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double value = 0.0;

        if(order.getBasic() > 0.0 && order.getBasic() < 100.0) {
            value += 20.0;
        } else if (order.getBasic() < 200.0) {
            value += 12.0;
        }
        return value;
    }
}
