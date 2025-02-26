package com.soumalya.CryptoTrade.Repository;

import com.soumalya.CryptoTrade.Model.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {
    VerificationCode findByUserId(Long userId);
}
