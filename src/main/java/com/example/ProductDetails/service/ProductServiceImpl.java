package com.example.ProductDetails.service;

import com.example.ProductDetails.entity.Product;
import com.example.ProductDetails.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductPrice(product.getProductPrice());
        existingProduct.setProductQuantity(product.getProductQuantity());
        existingProduct.setProductColor(product.getProductColor());
        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(product);
    }
}
