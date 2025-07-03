package com.voip.appvoip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voip.appvoip.entities.Call;
import com.voip.appvoip.entities.User;
import com.voip.appvoip.repositories.CallRepository;

@Service
public class CallService {
    @Autowired
    private CallRepository callRepository;

    public List<Call> getCalls(){
        return callRepository.findAll();
    }

    public List<Call> getCallsByUser(User user){
        return callRepository.findByCallerOrReceiver(user,user);
    }

    public Call saveCall(Call call){
        return callRepository.save(call);
    }
}
