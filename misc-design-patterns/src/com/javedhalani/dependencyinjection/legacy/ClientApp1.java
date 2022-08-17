package com.javedhalani.dependencyinjection.legacy;

public class ClientApp1 {

    private EmailService emailService = new EmailService();

    public static void main(String[] args) {
        ClientApp1 client = new ClientApp1();
        client.emailService.sendEmail("Hi Javed", "abc@example.com");

    }
}
