package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Model.CoinDTO;
import com.soumalya.CryptoTrade.Response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
