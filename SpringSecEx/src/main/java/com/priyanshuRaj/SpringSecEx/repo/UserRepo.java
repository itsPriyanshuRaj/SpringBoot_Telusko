package com.priyanshuRaj.SpringSecEx.repo;

import com.priyanshuRaj.SpringSecEx.modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    User findByUsername(String username);
}
