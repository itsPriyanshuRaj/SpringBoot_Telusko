package com.priyanshuraj.demo.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    @Id
    private String Id;
    @Indexed
    private String taskName;
    private String taskDesc;
    @Indexed
    private Instant taskDueDate;
    @Indexed
    private String taskStatus;
    @CreatedDate
    private Instant taskCreationDate;
    @LastModifiedDate
    private Instant taskModifiedDate;

    @Override
    public String toString() {
        return "Task{" +
                "Id=" + Id +
                ", taskName='" + taskName + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", taskDueDate=" + taskDueDate +
                ", taskStatus='" + taskStatus + '\'' +
                ", taskCreationDate=" + taskCreationDate +
                ", taskModifiedDate=" + taskModifiedDate +
                '}';
    }
}
