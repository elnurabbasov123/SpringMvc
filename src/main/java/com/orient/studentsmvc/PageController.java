package com.orient.studentsmvc;

import com.orient.studentsmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PageController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/students")
    public String students(Model model){
        List<Student> students =studentRepository.findAll();
        model.addAttribute("students",students);
        return "students";
    }

    @GetMapping("/create")
    public String create(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student){
        studentRepository.save(student);
        return "redirect:/students";
    }

    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable Long id){
        studentService.delete(id);


    }



}
