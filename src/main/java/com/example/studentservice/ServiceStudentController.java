package com.example.studentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceStudentController {

  @GetMapping("/")
  public String index() {
    return "<h1>Student Services</h1>\n<h2>Status: </h2> Running...";
  }

  @GetMapping("/all_students")
  public String listAllStudents() {
    return ServiceEstudiante.studentRepo.studentsList.toString();
  }

}