package org.example;

public class Hello {
    private String message;

    // Setter method for Dependency Injection
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}
