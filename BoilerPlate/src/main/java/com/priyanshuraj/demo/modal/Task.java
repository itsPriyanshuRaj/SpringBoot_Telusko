package com.priyanshuraj.demo.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Document(collection="task")
public class Task {
//    public Task(String id, String taskName, String taskDesc, Instant taskDueDate, String taskStatus, Instant taskCreationDate, Instant taskModifiedDate) {
//        this.id = id;
//        this.taskName = taskName;
//        this.taskDesc = taskDesc;
//        this.taskDueDate = taskDueDate;
//        this.taskStatus = taskStatus;
//        this.taskCreationDate = taskCreationDate;
//        this.taskModifiedDate = taskModifiedDate;
//    }



//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTaskName() {
//        return taskName;
//    }
//
//    public void setTaskName(String taskName) {
//        this.taskName = taskName;
//    }
//
//    public String getTaskDesc() {
//        return taskDesc;
//    }
//
//    public void setTaskDesc(String taskDesc) {
//        this.taskDesc = taskDesc;
//    }
//
//    public Instant getTaskDueDate() {
//        return taskDueDate;
//    }
//
//    public void setTaskDueDate(Instant taskDueDate) {
//        this.taskDueDate = taskDueDate;
//    }
//
//    public String getTaskStatus() {
//        return taskStatus;
//    }
//
//    public void setTaskStatus(String taskStatus) {
//        this.taskStatus = taskStatus;
//    }
//
//    public Instant getTaskCreationDate() {
//        return taskCreationDate;
//    }
//
//    public void setTaskCreationDate(Instant taskCreationDate) {
//        this.taskCreationDate = taskCreationDate;
//    }
//
//    public Instant getTaskModifiedDate() {
//        return taskModifiedDate;
//    }
//
//    public void setTaskModifiedDate(Instant taskModifiedDate) {
//        this.taskModifiedDate = taskModifiedDate;
//    }
    @Id
    private String id;
    private String taskName;
    private String taskDesc;
    private Instant taskDueDate;
    private String taskStatus;
    @CreatedDate
    private Instant taskCreationDate;
    @LastModifiedDate
    private Instant taskModifiedDate;

    @Override
    public String toString() {
        return "Task{" +
                "Id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", taskDueDate=" + taskDueDate +
                ", taskStatus='" + taskStatus + '\'' +
                ", taskCreationDate=" + taskCreationDate +
                ", taskModifiedDate=" + taskModifiedDate +
                '}';
    }
}
