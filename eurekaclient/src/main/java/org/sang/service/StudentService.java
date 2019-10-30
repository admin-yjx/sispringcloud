package org.sang.service;

import org.sang.mapper.StudentMapper;
import org.sang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public List<Student> Students(){
        return studentMapper.Students();
    }
    public Integer Add(Student student){
        return studentMapper.Add(student);
    }
    public Integer Update(Student student){
        return studentMapper.Update(student);
    }
    public Integer Delete(Integer sid){
        return studentMapper.Delete(sid);
    }
}
