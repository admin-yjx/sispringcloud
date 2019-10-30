package org.sang.feign;

import org.sang.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> Students() {
        return null;
    }
    @Override
    public String index() {
        return "服务器维护中......";
    }
}
