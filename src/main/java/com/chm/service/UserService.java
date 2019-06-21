package com.chm.service;

import com.chm.bean.User;
import com.chm.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try {
            user = userRepositoty.findByUserName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
