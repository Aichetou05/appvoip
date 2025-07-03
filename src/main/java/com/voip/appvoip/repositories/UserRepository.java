package com.voip.appvoip.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voip.appvoip.entities.User;


public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByEmail(String email);
    Optional<User> findBySipEtension(String sipEtension);
}
