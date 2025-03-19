package com.priyanshuRaj.SpringSecEx.repo;

import com.priyanshuRaj.SpringSecEx.modal.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, String> {

    Users findByUsername(String username);
}
