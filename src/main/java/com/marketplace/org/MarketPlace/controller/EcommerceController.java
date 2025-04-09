package com.marketplace.org.MarketPlace.controller;

import com.marketplace.org.MarketPlace.exception.ResourceNotFoundException;
import com.marketplace.org.MarketPlace.model.Product;
import com.marketplace.org.MarketPlace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    public class EcommerceController {
      // Autowiring Service class
        @Autowired
        private ProductService productService;

        @GetMapping("/msg")
        public String msg() {
            return "new Meesage ";
        }
@GetMapping("/api")
        public String getMessage(){
            return "New Meesage api";
}

    }

