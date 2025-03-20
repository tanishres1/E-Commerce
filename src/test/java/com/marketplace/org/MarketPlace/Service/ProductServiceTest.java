package com.marketplace.org.MarketPlace.Service;

import com.marketplace.org.MarketPlace.controller.EcommerceController;
import com.marketplace.org.MarketPlace.service.ProductService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


public class ProductServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;  // Assuming you have a ProductController

}
