package org.sang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.pojo.Student;
import org.sang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Autowired
    StudentService studentService;
    @Test
    public void Students(){
        List<Student> students=studentService.Students();
        System.out.println(students);
    }
}
