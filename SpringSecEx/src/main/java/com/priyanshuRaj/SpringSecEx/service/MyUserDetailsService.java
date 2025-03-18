package com.priyanshuRaj.SpringSecEx.service;

import com.priyanshuRaj.SpringSecEx.modal.User;
import com.priyanshuRaj.SpringSecEx.modal.UserPrincipal;
import com.priyanshuRaj.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found !!!");
        }
        return new UserPrincipal(user);
    }
}
