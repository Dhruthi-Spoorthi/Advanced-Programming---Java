package com.jewellery.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jewellery.store.model.Product;
import com.jewellery.store.repository.CategoryRepository;
import com.jewellery.store.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository,
                          CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product createProduct(Product product) {

        if (categoryRepository.findByName(product.getCategory()).isEmpty()) {
            throw new IllegalArgumentException("Category does not exist");
        }

        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}