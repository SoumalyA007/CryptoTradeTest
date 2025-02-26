package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Model.TwoFactorOTP;
import com.soumalya.CryptoTrade.Model.User;

public interface TwoFactorOtpService {

    TwoFactorOTP createTwoFactorOtp(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOtp,String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);

}
