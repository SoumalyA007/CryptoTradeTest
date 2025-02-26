package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}
