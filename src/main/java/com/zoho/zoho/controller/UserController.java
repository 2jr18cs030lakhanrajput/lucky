package com.zoho.zoho.controller;

import com.zoho.zoho.Repository.UserRepository;
import com.zoho.zoho.Service.UserService;
import com.zoho.zoho.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        User user1 = userService.createUser(user);

   return new ResponseEntity<>(user1, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getdata(@PathVariable("id")  long id){
        User getuser = userService.getuser(id);
        return new ResponseEntity<>(getuser,HttpStatus.OK);

    }

}
