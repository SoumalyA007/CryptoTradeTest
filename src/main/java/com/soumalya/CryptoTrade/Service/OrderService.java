package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Domain.OrderType;
import com.soumalya.CryptoTrade.Model.Coin;
import com.soumalya.CryptoTrade.Model.Order;
import com.soumalya.CryptoTrade.Model.OrderItem;
import com.soumalya.CryptoTrade.Model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
