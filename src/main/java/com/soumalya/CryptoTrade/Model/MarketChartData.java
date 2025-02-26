package com.soumalya.CryptoTrade.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarketChartData {
    private long timestamp;
    private double price;

}
