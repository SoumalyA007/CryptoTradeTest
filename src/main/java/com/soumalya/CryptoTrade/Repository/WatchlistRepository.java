package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {

    Watchlist findByUserId(Long userId);

}
