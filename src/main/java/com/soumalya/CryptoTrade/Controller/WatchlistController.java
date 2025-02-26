package com.soumalya.CryptoTrade.Controller;

import com.soumalya.CryptoTrade.Model.Coin;
import com.soumalya.CryptoTrade.Model.User;
import com.soumalya.CryptoTrade.Model.Watchlist;
import com.soumalya.CryptoTrade.Service.CoinService;
import com.soumalya.CryptoTrade.Service.UserService;
import com.soumalya.CryptoTrade.Service.WatchlistService;
import com.soumalya.CryptoTrade.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {
    private final WatchlistService watchlistService;
    private final UserService userService;

    @Autowired
    private CoinService coinService;

    @Autowired
    public WatchlistController(WatchlistService watchlistService,
                               UserService userService) {
        this.watchlistService = watchlistService;
        this.userService=userService;
    }

    @GetMapping("/user")
    public ResponseEntity<Watchlist> getUserWatchlist(
            @RequestHeader("Authorization") String jwt) throws Exception {

            User user=userService.findUserProfileByJwt(jwt);
            Watchlist watchlist = watchlistService.findUserWatchlist(user.getId());
            return ResponseEntity.ok(watchlist);

    }

    @PostMapping("/create")
    public ResponseEntity<Watchlist> createWatchlist(
            @RequestHeader("Authorization") String jwt) throws UserException {
        User user=userService.findUserProfileByJwt(jwt);
        Watchlist createdWatchlist = watchlistService.createWatchList(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWatchlist);
    }

    @GetMapping("/{watchlistId}")
    public ResponseEntity<Watchlist> getWatchlistById(
            @PathVariable Long watchlistId) throws Exception {

            Watchlist watchlist = watchlistService.findById(watchlistId);
            return ResponseEntity.ok(watchlist);

    }

    @PatchMapping("/add/coin/{coinId}")
    public ResponseEntity<?> addItemToWatchlist(
            @RequestHeader("Authorization") String jwt,
            @PathVariable String coinId) {
        try {
            // Fetch user by JWT
            User user = userService.findUserProfileByJwt(jwt);
            if (user == null) {
                throw new Exception("Invalid JWT: User not found.");
            }
            System.out.println("User fetched: " + user);

            // Fetch coin
            Coin coin = coinService.findById(coinId);
            if (coin == null) {
                throw new Exception("Coin not found with ID: " + coinId);
            }
            System.out.println("Coin fetched: " + coin);

            // Add item to the watchlist
            Coin addedCoin = watchlistService.addItemToWatchlist(coin, user);
            return ResponseEntity.ok(addedCoin);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
