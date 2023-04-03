package com.learning.productservice.repository;

/**
 * @author mofizhaider
 * @since 3/30/23
 */
import com.learning.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
