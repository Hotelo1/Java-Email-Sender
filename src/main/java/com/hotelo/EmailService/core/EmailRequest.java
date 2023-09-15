package com.hotelo.EmailService.core;

public record EmailRequest(String to, String subject, String body) {
}
