package com.orient.studentsmvc.service.impl;

import com.orient.studentsmvc.Student;
import com.orient.studentsmvc.StudentCrrudRepo;
import com.orient.studentsmvc.StudentRepository;
import com.orient.studentsmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
    StudentCrrudRepo studentCrrudRepo;

    @Override
    public Student findById(Long id) {
        Student student=studentCrrudRepo.findById(id).get();
        return student;
    }

    @Override
    public Student update(Long id,Student newStudent) {

       Student oldStudent=studentCrrudRepo.findById(id).get();
        oldStudent.setLastName(newStudent.getLastName());
        oldStudent.setFirstName(newStudent.getFirstName());
        oldStudent.setEmail(newStudent.getEmail());
        return newStudent;
    }

    @Override
    public void delete(Long id) {
        Student student=studentCrrudRepo.findById(id).get();
        studentCrrudRepo.delete(student);
    }
}
