package com.example.CourseRegister.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class CourseRegister {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    private String CourseName;
    private String email;
    private String name;

    public CourseRegister(){

    }

    public CourseRegister(String courseName, String email, String name) {
        CourseName = courseName;
        this.email = email;
        this.name = name;
    }


}
