package org.example.MessageService;

import org.springframework.stereotype.Component;

@Component
public class Email implements MsgSender {
    @Override
    public void sendMsg(String message) {
        System.out.println("Email sent: " + message);
    }
}
