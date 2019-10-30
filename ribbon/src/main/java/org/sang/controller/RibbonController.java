package org.sang.controller;

import org.sang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/students")
    public Collection<Student> Students(){
        return restTemplate.getForEntity("http://provider/student",Collection.class).getBody();
    }
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/index",String.class);
    }
}
