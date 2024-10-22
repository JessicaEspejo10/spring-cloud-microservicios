package com.example.checkout.controller;

import com.example.checkout.model.Checkout;
import com.example.checkout.service.ICheckoutService;
import org.springframework.web.bind.annotation.*;

import java.io.FilterOutputStream;
import java.util.List;
@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService){
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping
    public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-from") String requestFrom) {
        System.out.println("enviado desde " + requestFrom);
        if(!requestFrom.equals("gateway")){
            return  null;
        }
        return checkoutService.buildCheckout(productIds);
    }

}
