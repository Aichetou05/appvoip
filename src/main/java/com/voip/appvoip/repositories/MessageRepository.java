package com.voip.appvoip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voip.appvoip.entities.Message;
import com.voip.appvoip.entities.User;

public interface MessageRepository extends JpaRepository<Message,Long>{
    List<Message> findBySender(User sender);
    List<Message> findByReceiver(User receiver);
    List<Message> findBySenderAndReceiver(User sender,User receiver);
}
