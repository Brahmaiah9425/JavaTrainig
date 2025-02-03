package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean from context
        Hello obj = (Hello) context.getBean("hello");

        // Call the method to display the message
        obj.displayMessage();

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
