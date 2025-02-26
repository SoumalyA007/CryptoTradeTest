package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Domain.VerificationType;
import com.soumalya.CryptoTrade.Model.ForgotPasswordToken;
import com.soumalya.CryptoTrade.Model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
