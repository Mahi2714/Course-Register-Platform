package com.example.CourseRegister.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    private int CourseId;
    private String CourseName;
    private int DurationMonth;
    private String Trainer;

    public Course(){

    }



}
