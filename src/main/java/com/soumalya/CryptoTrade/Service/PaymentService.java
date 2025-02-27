package com.soumalya.CryptoTrade.Service;

import com.razorpay.RazorpayException;
import com.soumalya.CryptoTrade.Domain.PaymentMethod;
import com.soumalya.CryptoTrade.Model.PaymentOrder;
import com.soumalya.CryptoTrade.Model.User;
import com.soumalya.CryptoTrade.Response.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
