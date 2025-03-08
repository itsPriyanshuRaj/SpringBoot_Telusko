package com.priyanshuraj.demo.service;

import com.priyanshuraj.demo.modal.Task;
import com.priyanshuraj.demo.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepository;

//    to fetch all Products from the database
    public List<Task> getTask(){
        return taskRepository.findAll();
    }
//    to fetch products by Id
    public Task getTaskbyId(String id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with the given ID"));
    }
//    to post products in the database
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

//    to update the task with id
    public Task updateTask(String id, Task task){
        Task existingTask = taskRepository.findById(id).orElseThrow(()-> new RuntimeException("No task found to update"));
        if (task.getTaskName() != null) existingTask.setTaskName(task.getTaskName());
        if (task.getTaskDesc() != null) existingTask.setTaskDesc(task.getTaskDesc());
        if (task.getTaskDueDate() != null) existingTask.setTaskDueDate(task.getTaskDueDate());
        if (task.getTaskStatus() != null) existingTask.setTaskStatus(task.getTaskStatus());
        if(task.getTaskCreationDate() != null) existingTask.setTaskCreationDate(task.getTaskCreationDate());

        // Update the modified date
        existingTask.setTaskModifiedDate(Instant.now());

        return taskRepository.save(existingTask);
    }
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }




}
