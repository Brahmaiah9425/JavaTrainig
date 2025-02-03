package com.example.bank;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements AccountService {
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Current Account");
    }

    @Override
    public void accountDetails() {
        System.out.println("Interest Rate: 0%");
        System.out.println("Minimum Balance: $500");
    }
}
