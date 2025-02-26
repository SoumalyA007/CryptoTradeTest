package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
