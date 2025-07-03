package com.voip.appvoip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voip.appvoip.entities.User;
import com.voip.appvoip.entities.Voicemail;
import com.voip.appvoip.repositories.VoicemailRepository;

@Service
public class VoicemailService {
    @Autowired
    private VoicemailRepository voicemailRepository;

    public List<Voicemail> getVoicemailsByUser(User user){
        return voicemailRepository.findByUser(user);
    }

    public Voicemail saveVoicemail(Voicemail voicemail){
        return voicemailRepository.save(voicemail);
    }
}
