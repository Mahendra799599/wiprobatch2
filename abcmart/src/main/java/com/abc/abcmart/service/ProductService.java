package com.abc.abcmart.service;

import java.util.List;

import com.abc.abcmart.entity.Product;

public interface ProductService {
    Product saveProduct(Product product);
    
    Product getProductById(int productId);
    
    List<Product> getAllProducts();
    
    Product updateProduct(Product product);
    
    void deleteProduct(int productId);
    
    List<Product> getProductsByCategory(String categoryName);
    
    List<Product> getProductsWithInPriceRange(double minPrice,double maxPrice);
}
