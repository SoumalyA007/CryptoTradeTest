package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Model.Coin;
import com.soumalya.CryptoTrade.Model.User;
import com.soumalya.CryptoTrade.Model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
