package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "Can not be null")
    @Size(min=4, message = "Please Enter a Valid value")
    private String Task_Name;
    @NotNull
    @Size(min=4)
    private String duedate;
    @NotNull
    @Size(min=3)
  private String priority;
    private String description;
    private boolean is_completed;
    //private String pictures;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask_Name() {
        return Task_Name;
    }

    public void setTask_Name(String task_Name) {
        Task_Name = task_Name;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public void setPriority(String priority) {
        this.priority = priority;

    }

//    public String getPictures() {
//        return pictures;
//    }
//
//    public void setPictures(String pictures) {
//        this.pictures = pictures;
//    }
}
