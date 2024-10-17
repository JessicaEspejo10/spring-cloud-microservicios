package com.example.checkout.service.implementation;

import com.example.checkout.model.dto.Product;
import com.example.checkout.repository.FeignProductRepository;
import com.example.checkout.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private FeignProductRepository feignProductRepository;

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public Product getProduct(String id) {
        return feignProductRepository.getProductById(id);
    }
}
