package com.example.CourseRegister.Service;

import com.example.CourseRegister.Module.Course;
import com.example.CourseRegister.Module.CourseRegister;
import com.example.CourseRegister.Repository.CourseRegisterRepository;
import com.example.CourseRegister.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {
    @Autowired
    CourseRepository repository;
    @Autowired
    CourseRegisterRepository registerRepository;



    public List<Course> getCourse() {
        return repository.findAll();

    }

    public List<CourseRegister> getRegisteredStud() {
        return registerRepository.findAll();
    }

    public void register(String CourseName, String email, String name) {
        CourseRegister courseregister=new CourseRegister(CourseName,email,name);
        registerRepository.save(courseregister);
    }
}
