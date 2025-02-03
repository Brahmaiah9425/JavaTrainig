package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class email implements MsgSender {
    @Override
    public void sendMsg(String message) {
        System.out.println("Email sent: " + message);
    }
}