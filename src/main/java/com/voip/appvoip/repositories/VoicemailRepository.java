package com.voip.appvoip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voip.appvoip.entities.User;
import com.voip.appvoip.entities.Voicemail;

public interface VoicemailRepository extends JpaRepository<Voicemail,Long>{
    List<Voicemail> findByUser(User user);
}
