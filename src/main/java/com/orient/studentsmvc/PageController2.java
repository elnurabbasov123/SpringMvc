package com.orient.studentsmvc;

import com.orient.studentsmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PageController2 {

    @Autowired
    StudentService studentService;

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Student student){
        studentService.update(id,student);

    }
}
