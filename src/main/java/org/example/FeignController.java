package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignInterface service;

    @GetMapping("/s1")
    public String getstudent(){
        return  service.getStudents();
    }
}
