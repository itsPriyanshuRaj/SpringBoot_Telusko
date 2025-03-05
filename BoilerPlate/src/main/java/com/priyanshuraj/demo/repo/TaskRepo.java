package com.priyanshuraj.demo.repo;

import com.priyanshuraj.demo.modal.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends MongoRepository<Task, String> {
}
