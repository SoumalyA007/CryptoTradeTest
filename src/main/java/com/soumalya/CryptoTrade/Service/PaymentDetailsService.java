package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Model.PaymentDetails;
import com.soumalya.CryptoTrade.Model.User;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
