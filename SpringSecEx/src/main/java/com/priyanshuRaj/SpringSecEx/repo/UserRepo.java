package com.priyanshuRaj.SpringSecEx.repo;

import com.priyanshuRaj.SpringSecEx.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
