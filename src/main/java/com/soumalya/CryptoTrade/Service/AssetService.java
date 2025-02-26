package com.soumalya.CryptoTrade.Service;



import com.soumalya.CryptoTrade.Model.Asset;
import com.soumalya.CryptoTrade.Model.Coin;
import com.soumalya.CryptoTrade.Model.User;

import java.util.List;

public interface AssetService {
    Asset createAsset(User user, Coin coin, double quantity);

    Asset getAssetById(Long assetId);

    Asset getAssetByUserAndId(Long userId,Long assetId);

    List<Asset> getUsersAssetsList(Long userId);

    Asset updateAsset(Long assetId,double quantity) throws Exception;

    Asset findAssetByUserIdAndCoinId(Long userId,String coinId) throws Exception;

    void deleteAsset(Long assetId);


}
