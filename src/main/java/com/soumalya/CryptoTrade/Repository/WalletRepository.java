package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {

    public Wallet findByUserId(Long userId);


}
