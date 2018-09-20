package com.nav.utility;

import com.nav.Model.Student;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="m-service-db")
//@RibbonClient(name="m-service-db")
public interface DbServiceClient {

    @GetMapping("/student/get/{id}")
    public Student getStudentData(@PathVariable("id") Long id);

    @PostMapping("/student/store")
    public List<Student> saveStudent(@RequestBody Student student);

    @DeleteMapping("/student/delete/{id}")
    public List<Student> deleteStudent(@PathVariable("id") Long id);
}

