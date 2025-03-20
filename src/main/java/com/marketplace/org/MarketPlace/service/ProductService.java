package com.marketplace.org.MarketPlace.service;
import com.marketplace.org.MarketPlace.exception.ResourceNotFoundException;
import com.marketplace.org.MarketPlace.model.Product;
import com.marketplace.org.MarketPlace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    
     // create products
     public List<Product> saveProducts(List<Product> products) {
         return productRepository.saveAll(products); // Bulk save
     }

    // get All products
    public List<Product> getAllProducts() {
         return productRepository.findAll();
    }

    // get product by id
    public Product getProductById(Long id) throws ResourceNotFoundException {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        return (product);
    }
    //delete product by id
    public Product deleteProduct(Long id) throws ResourceNotFoundException {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        productRepository.delete(product);
        return product;
    }
    // update product by id

    public  Product updateProduct(Long id, Product product) throws ResourceNotFoundException {
         Product existingProduct=productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product not found with id "+id));
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        return (productRepository.save(existingProduct));
    }


}
