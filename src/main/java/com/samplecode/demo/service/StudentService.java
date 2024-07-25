package com.samplecode.demo.service;

import com.samplecode.demo.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student) ;
    public List<Student> getAllStudents();
}
