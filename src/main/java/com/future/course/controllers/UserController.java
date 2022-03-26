package com.future.course.controllers;


import com.future.course.interfaces.UserRepository;
import com.future.course.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/")
    public List<User> getUsers(){
        return  userRepository.findAll();
    }


    @RequestMapping("/{id}")
    public List<User> getUsersForACourse(@PathVariable("id") BigInteger id){
        return  userRepository.findBycourseid(id);
    }


}
