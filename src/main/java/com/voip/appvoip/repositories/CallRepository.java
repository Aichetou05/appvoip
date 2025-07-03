package com.voip.appvoip.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voip.appvoip.entities.Call;
import com.voip.appvoip.entities.User;

public interface CallRepository extends JpaRepository<Call,Long>{
    List<Call> findByCaller(User caller);
    List<Call> findByReceiver(User receiver);
    List<Call> findByCallerOrReceiver(User caller,User receiver);
}
