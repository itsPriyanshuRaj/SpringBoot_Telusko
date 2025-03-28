package com.priyanshuRaj.Spring.security.with.Gemini.Services;

import com.priyanshuRaj.Spring.security.with.Gemini.modal.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User("Raj", "abc" ,"Abc@gmail.com"));
        list.add(new User("Virat","RCB", "rcb@gmail.com"));
    }

//    to get all the user
    public List<User> getAllUser(){
        return this.list;
    }

//    to get one specific user
    public User getUserbyUsername(String username){
        return this.list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
    }

//    to add user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
