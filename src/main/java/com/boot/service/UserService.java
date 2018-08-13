package com.boot.service;

import com.boot.model.User;
import com.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        userRepository.save(user);
        return userRepository.findOne(user.getId());
    }

    public User findeOne(int id){
        return userRepository.findOne(id);
    }
}