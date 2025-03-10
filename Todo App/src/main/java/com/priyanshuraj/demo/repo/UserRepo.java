package com.priyanshuraj.demo.repo;

import com.priyanshuraj.demo.modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
}
