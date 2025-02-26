package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Domain.WalletTransactionType;
import com.soumalya.CryptoTrade.Model.Wallet;
import com.soumalya.CryptoTrade.Model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
