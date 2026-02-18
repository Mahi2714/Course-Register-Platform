package com.example.CourseRegister.Repository;

import com.example.CourseRegister.Module.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisterRepository extends JpaRepository<CourseRegister,Integer> {

}
