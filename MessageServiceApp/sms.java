package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class sms implements MsgSender {
    @Override
    public void sendMsg(String message) {
        System.out.println("SMS sent: " + message);
    }
}