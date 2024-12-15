package com.zoho.zoho.Service;

import com.zoho.zoho.Repository.UserRepository;
import com.zoho.zoho.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getuser(long id){
        return userRepository.findById(id).get();

    }

}
