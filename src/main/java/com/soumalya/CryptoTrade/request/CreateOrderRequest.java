package com.soumalya.CryptoTrade.request;

import com.soumalya.CryptoTrade.Domain.OrderType;
import lombok.Data;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
