package com.priyanshuraj.demo.controller;

import com.priyanshuraj.demo.modal.Task;
import com.priyanshuraj.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/")
    public String home(){
        return "Welcome to BoilerPlate project with Spring Boot!!!";
    }

    @Autowired
    private TaskService taskService;
    @GetMapping("/getTask")
    public List<Task> getTask(){
        return taskService.getTask();
    }

    @GetMapping("/getTask/{id}")
    public Task getTaskbyId(@PathVariable String id){
        return taskService.getTaskbyId(id);
    }

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task task){
        System.out.println(task);
        return taskService.createTask(task);
    }

    @PutMapping("/updateTask/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task task){
        System.out.println(task);
        Task updatedTask = taskService.updateTask(id,task);
        return taskService.updateTask(id,task);
    }

    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
    }




//    demo code
//    @PostMapping("/saveTask")
//    public ResponseEntity<Task> createTask(@RequestBody Task task) {
//        return ResponseEntity.ok(taskService.createTask(task));
//    }
//
//    // 🔹 Get All Tasks
//    @GetMapping("/getTask")
//    public ResponseEntity<List<Task>> getAllTasks() {
//        return ResponseEntity.ok(taskService.getTask());
//    }
}
