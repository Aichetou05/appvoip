package com.voip.appvoip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voip.appvoip.entities.Notification;
import com.voip.appvoip.entities.User;

public interface NotificationRepository extends JpaRepository<Notification,Long>{
    List<Notification> findByUser(User user);
    List<Notification> findByUserANdRead(User user,boolean read);
}
