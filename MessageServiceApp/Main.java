package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class msgClient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(msgClient.class);

        MessageService messageService = context.getBean(MessageService.class);


        messageService.processMessage("Hello, this is a test message!");
    }
}