package com.soumalya.CryptoTrade.Controller;

import com.soumalya.CryptoTrade.Service.EmailService;
import com.soumalya.CryptoTrade.Service.UserService;
import com.soumalya.CryptoTrade.Service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    private final VerificationService verificationService;
    private final UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }




}
