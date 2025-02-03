package com.example.bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankService {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService savingAccount = context.getBean(SavingAccount.class);
        AccountService currentAccount = context.getBean(CurrentAccount.class);

        System.out.println("Saving Account Details:");
        savingAccount.displayAccountType();
        savingAccount.accountDetails();

        System.out.println("\nCurrent Account Details:");
        currentAccount.displayAccountType();
        currentAccount.accountDetails();

        context.close();
    }
}
