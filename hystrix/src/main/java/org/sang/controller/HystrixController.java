package org.sang.controller;

import org.sang.feign.FeignProviderClient;
import org.sang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/students")
    public Collection<Student> Students(){
        return feignProviderClient.Students();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
