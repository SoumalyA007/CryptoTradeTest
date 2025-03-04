package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Model.Coin;
import com.soumalya.CryptoTrade.Model.User;
import com.soumalya.CryptoTrade.Model.Watchlist;
import com.soumalya.CryptoTrade.Repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WatchlistServiceImpl implements WatchlistService{
    @Autowired
    private WatchlistRepository watchlistRepository;


    @Override
    public Watchlist findUserWatchlist(Long userId) throws Exception {
        Watchlist watchlist = watchlistRepository.findByUserId(userId);
        if (watchlist == null) {
            System.out.println("Watchlist not found for userId: " + userId + ". Creating a new watchlist.");
            User user = new User(); // You need to fetch the user here.
            user.setId(userId); // Ensure the User ID is set correctly.
            watchlist = createWatchList(user);
        }
        System.out.println("Watchlist fetched or created: " + watchlist);
        return watchlist;
    }


    @Override
    public Watchlist createWatchList(User user) {
        Watchlist watchlist=new Watchlist();
        watchlist.setUser(user);
        return watchlistRepository.save(watchlist);
    }

    @Override
    public Watchlist findById(Long id) throws Exception {
        Optional<Watchlist> optionalWatchlist = watchlistRepository.findById(id);
        if(optionalWatchlist.isEmpty()){
            throw new Exception("watch list not found");
        }
        return optionalWatchlist.get();
    }

    @Override
    public Coin addItemToWatchlist(Coin coin,User user) throws Exception {
        Watchlist watchlist=findUserWatchlist(user.getId());

        if(watchlist.getCoins().contains(coin)){
            watchlist.getCoins().remove(coin);
        }
        else watchlist.getCoins().add(coin);
        Watchlist watch =watchlistRepository.save(watchlist);
        System.out.println("Watchlist updated: " + watch);
        return coin;
    }
}
