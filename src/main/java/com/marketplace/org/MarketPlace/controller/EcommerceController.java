package com.marketplace.org.MarketPlace.controller;

import com.marketplace.org.MarketPlace.exception.ResourceNotFoundException;
import com.marketplace.org.MarketPlace.model.Product;
import com.marketplace.org.MarketPlace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/product")
    public class EcommerceController {
      // Autowiring Service class
        @Autowired
        private ProductService productService;



        @GetMapping
        public String getGithub1(){
            return "Currently wotking git hub push";
        }
        // Creating products
        @PostMapping("/add")
        public ResponseEntity<List> addProducts(@RequestBody List<Product> products) {
            // Save list of products
            List<Product> savedProducts = productService.saveProducts(products);
            return ResponseEntity.ok(savedProducts);
    }
    // get all products
    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> listOfProducts = productService.getAllProducts();
        return new ResponseEntity<>(listOfProducts, HttpStatus.OK);
    }
    // Get String message
    @GetMapping("/msg")
    public String msg() {
        return "Welcome to E-commerce!!!!";
    }
    //Get Product by id
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) throws ResourceNotFoundException {
        Product pid=productService.getProductById(id);
        return new ResponseEntity(pid,HttpStatus.OK);
    }
    //Update Product by id
    @PutMapping("update/{id}")
    public ResponseEntity<Product> updateProductById(@RequestBody Product product, @PathVariable long id) throws ResourceNotFoundException {
        Product updateProduct=productService.updateProduct(id,product);
        return new ResponseEntity(updateProduct,HttpStatus.OK);
}
    // delete product by id
    @DeleteMapping("delete/{id}")
    public Product deleteProductById(@PathVariable long id) throws ResourceNotFoundException {
       Product deleteProductId= productService.deleteProduct(id);
        return deleteProductId;
}


}