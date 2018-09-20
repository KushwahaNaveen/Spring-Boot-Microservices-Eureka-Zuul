package com.nav.controller;

import com.nav.Model.Student;
import com.nav.utility.DbServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManagaeStudentController {

    @Autowired
    DbServiceClient proxy;

    @GetMapping("/student-feign/get/{id}")
    public Student getStudent(@PathVariable("id") Long id)
    {
        Student stu = proxy.getStudentData(id);
        return stu;
    }

    @PostMapping("/student-feign/store")
    public List<Student> storeStudent(@RequestBody Student student)
    {
        List<Student> stuList = proxy.saveStudent(student);
        return stuList;
    }
}
