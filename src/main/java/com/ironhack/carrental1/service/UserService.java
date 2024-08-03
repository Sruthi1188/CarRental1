package com.ironhack.carrental1.service;


import com.ironhack.carrental1.model.User;

import java.util.List;


public interface UserService {



    User saveUser(User user);


    User getUser(String username);


    List<User> getUsers();
}
