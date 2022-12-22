package com.backend.fullstack.controller;

import com.backend.fullstack.model.Student;
import com.backend.fullstack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

@Autowired
 StudentService service;

@GetMapping("fetchAll")
public List<Student> getAllStudent(){

    return service.getAllStudent();
}

@PostMapping("add")
public Student addStudent(Student student){
    return service.addStudent(student);
}

@GetMapping("/{name}")
public Student getStudentByName(@PathVariable String name){

    return service.getStudentByName(name);
}

    @DeleteMapping("/{name}")
    public String deleteStudentByName(@PathVariable String name){
    return service.deleteStudent(name);
    }

}
