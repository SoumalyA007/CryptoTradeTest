package com.soumalya.CryptoTrade.Service;


import com.soumalya.CryptoTrade.Model.Order;
import com.soumalya.CryptoTrade.Model.User;
import com.soumalya.CryptoTrade.Model.Wallet;
import com.soumalya.CryptoTrade.exception.WalletException;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
