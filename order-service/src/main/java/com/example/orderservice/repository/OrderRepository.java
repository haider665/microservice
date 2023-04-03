package com.example.orderservice.repository;

/**
 * @author mofizhaider
 * @since 4/2/23
 */
import com.example.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}