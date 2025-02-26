package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.Wallet;
import com.soumalya.CryptoTrade.Model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
