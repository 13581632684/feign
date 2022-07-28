package org.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "student", fallback = FeignInterfaceTest.class, url = "http://localhost:8081")
//@FeignClient("student")
public interface FeignInterface{

    @RequestMapping(value = "/students" ,method = RequestMethod.GET)
    String getStudents();
}
