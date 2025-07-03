package com.voip.appvoip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voip.appvoip.entities.Message;
import com.voip.appvoip.entities.User;
import com.voip.appvoip.repositories.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesBetweenUsers(User sender,User receiver){
        return messageRepository.findBySenderAndReceiver(sender,receiver);
    }

    public Message saveMessage(Message message){
        return messageRepository.save(message);
    }
}
