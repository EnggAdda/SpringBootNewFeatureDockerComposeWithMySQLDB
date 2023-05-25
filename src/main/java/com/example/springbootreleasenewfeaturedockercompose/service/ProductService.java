package com.example.springbootreleasenewfeaturedockercompose.service;

import com.example.springbootreleasenewfeaturedockercompose.entity.Product;

import java.util.List;

public interface ProductService {

     Product insertProduct(Product product);

     List<Product> getProducts();

}
