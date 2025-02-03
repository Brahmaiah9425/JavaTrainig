package com.example.bank;

import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements AccountService {
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Saving Account");
    }

    @Override
    public void accountDetails() {
        System.out.println("Interest Rate: 4%");
        System.out.println("Minimum Balance: $100");
    }
}
