package com.voip.appvoip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voip.appvoip.entities.Notification;
import com.voip.appvoip.entities.User;
import com.voip.appvoip.repositories.NotificationRepository;

@Service
public class NotificationService {
    @Autowired 
    private NotificationRepository notificationRepository;

    public List<Notification> geNotificationsByUser(User user){
        return notificationRepository.findByUser(user);
    }

    public Notification saveNotification(Notification notification){
        return notificationRepository.save(notification);
    }
}
