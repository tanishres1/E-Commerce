package com.marketplace.org.MarketPlace.repository;

import com.marketplace.org.MarketPlace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}