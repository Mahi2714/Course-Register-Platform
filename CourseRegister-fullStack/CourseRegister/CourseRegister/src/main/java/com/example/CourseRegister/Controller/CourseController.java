package com.example.CourseRegister.Controller;

import com.example.CourseRegister.Module.Course;
import com.example.CourseRegister.Module.CourseRegister;
import com.example.CourseRegister.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@CrossOrigin(origins ="*")
public class CourseController {
    @Autowired
    CourseService service;
    @GetMapping("/Courses")
    public List<Course> getCourse(){
       return  service.getCourse();
    }
    @GetMapping("/Courses/RegisteredStudents")
    public List<CourseRegister> getRegisteredStud(){
        return service.getRegisteredStud();
    }

    @PostMapping("/Courses/Register")
    public String register(@RequestParam("CourseName") String CourseName,
                           @RequestParam("email") String email,
                           @RequestParam("name") String name){
        service.register(CourseName,email,name);
        return "Thankyou for Reigistering " +name+ " Advance Wishes for Learining";
    }




}



