package org.sang.controller;

import org.sang.pojo.Student;
import org.sang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @Value("${server.port}")
    String port;
    @GetMapping("/student")
    public Object Students(){
        List<Student> students = studentService.Students();
        return students;
    }
    @PostMapping("/student")
    public Integer Add(@RequestBody Student student){
        return  studentService.Add(student);
    }
    @PutMapping("/student/{sid}")
    public Integer Update(@RequestBody Student student, @PathVariable Integer sid){
        student.setSid(sid);
        return studentService.Update(student);
    }
    @DeleteMapping("/student/{sid}")
    public Integer Delete(@PathVariable Integer sid){
        return studentService.Delete(sid);
    }
    @GetMapping("/index")
    public String port(){
        return port;
    }
}
