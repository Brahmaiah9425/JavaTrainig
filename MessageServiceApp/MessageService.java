package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private final MsgSender msgSender;

    @Autowired
    public MessageService(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public void processMessage(String message) {
        msgSender.sendMsg(message);
    }
}