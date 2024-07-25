package com.samplecode.demo.controller;

import com.samplecode.demo.model.Student;
import com.samplecode.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Service
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }
@GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
}
}
