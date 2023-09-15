package com.hotelo.EmailService.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
