package com.soumalya.CryptoTrade.request;

import com.soumalya.CryptoTrade.Domain.VerificationType;
import lombok.Data;

@Data
public class UpdatePasswordRequest {
    private String sendTo;
    private VerificationType verificationType;
}
