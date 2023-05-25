package com.example.springbootreleasenewfeaturedockercompose.repo;

import com.example.springbootreleasenewfeaturedockercompose.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
