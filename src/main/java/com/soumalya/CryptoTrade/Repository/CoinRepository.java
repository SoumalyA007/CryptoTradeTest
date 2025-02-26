package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
