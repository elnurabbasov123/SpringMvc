package com.orient.studentsmvc.service;

import com.orient.studentsmvc.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Student findById(Long id);
    Student update(Long id,Student student);
    void delete(Long id);


}
