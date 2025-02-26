package com.soumalya.CryptoTrade.Service;

import com.soumalya.CryptoTrade.Domain.VerificationType;
import com.soumalya.CryptoTrade.Model.User;
import com.soumalya.CryptoTrade.Model.VerificationCode;

public interface VerificationService {
    VerificationCode sendVerificationOTP(User user, VerificationType verificationType);

    VerificationCode findVerificationById(Long id) throws Exception;

    VerificationCode findUsersVerification(User user) throws Exception;

    Boolean VerifyOtp(String opt, VerificationCode verificationCode);

    void deleteVerification(VerificationCode verificationCode);
}
