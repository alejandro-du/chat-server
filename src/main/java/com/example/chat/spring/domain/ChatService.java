package com.example.chat.spring.domain;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatService {

    @MessageMapping("/chat")
    @SendTo("/topic/vaadin")
    public Message send(@Payload Message message) {
        return message;
    }

}
