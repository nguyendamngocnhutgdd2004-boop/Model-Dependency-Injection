package com.example.modeldependencyinjection;

import com.example.modeldependencyinjection.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        // Tạo sẵn 3 sản phẩm giả lập
        products.add(new Product(1L, "Laptop Dell", 1500.0));
        products.add(new Product(2L, "Bàn phím cơ", 85.0));
        products.add(new Product(3L, "Chuột không dây", 25.0));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}