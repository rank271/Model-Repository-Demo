package com.example.modelrepositorydemo.service;

import com.example.modelrepositorydemo.Entity.User;
import org.springframework.stereotype.Service;

/**
 * @className: userService
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Service
public class userService {
    public User getUser(){
        return new User();
    }
}
