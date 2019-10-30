package org.sang.feign;

import org.sang.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student")
    public Collection<Student> Students();
    @GetMapping("/index")
    public String index();
}
