package com.contexua.xcelvie.dao;

import com.contexua.xcelvie.models.OrderBook;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Physical interface to persistence layer, service does not need to know about implementation
 */
public interface OrderBookDao extends MongoRepository<OrderBook, String> {
    Optional<OrderBook> findByClientEmail(String clientEmail);
}