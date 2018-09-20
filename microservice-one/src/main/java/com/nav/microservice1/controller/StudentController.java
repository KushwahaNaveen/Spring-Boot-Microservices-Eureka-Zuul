package com.nav.microservice1.controller;

import com.nav.microservice1.bo.Student;
import com.nav.microservice1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository stuRepo;

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") String id)
    {

        Student stu = stuRepo.findById(Long.valueOf(id)).get();
        return stu;
    }

    @PostMapping("/store")
    public List<Student> storeData(@RequestBody Student student)
    {

        stuRepo.save(student);
        List<Student> studentList = stuRepo.findAll();
        return studentList;
    }

    @DeleteMapping("/delete/{id}")
    public List<Student> deleteData(@PathVariable("id") Long id)
    {
        stuRepo.deleteById(id);
        List<Student> stuList = stuRepo.findAll();
        return stuList;
    }
}
