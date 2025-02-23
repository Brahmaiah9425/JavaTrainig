package org.example.MessageService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sms implements MsgSender {
    @Override
    public void sendMsg(String message) {
        System.out.println("SMS sent: " + message);
    }
}
