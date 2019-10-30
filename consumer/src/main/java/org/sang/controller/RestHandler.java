package org.sang.controller;

import org.sang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/students")
    public Collection<Student> Students(){
        return restTemplate.getForEntity("http://localhost:8010/student",Collection.class).getBody();
    }
    @PostMapping("/Add")
    public Integer Add(@RequestBody Student student){
        return restTemplate.postForObject("http://localhost:8010/student",student,Integer.class);
    }
    @PutMapping("/Update/{id}")
    public void Update(@RequestBody Student student,@PathVariable Integer id){
          restTemplate.put("http://localhost:8010/student/{id}",student,id);
    }
    @DeleteMapping("/Delete/{id}")
    public void Delete(@PathVariable Integer id){
        restTemplate.delete("http://localhost:8010/student/{id}",id);
    }
}
