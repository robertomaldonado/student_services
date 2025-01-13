package com.example.studentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentservice.services.ServiceEstudiante;

@RestController
public class ServiceStudentController {

  ServiceEstudiante serv = new ServiceEstudiante();

  @GetMapping("/")
  public String index() {
    return "<h1>Student Services</h1>\n<h2>Status: </h2> Running...";
  }

  @GetMapping("/all_students")
  public String listAllStudents() {
    return serv.listAllStudents().toString();
  }

  @GetMapping("/sorted_gpa")
  public String listSortedByGPA() {
    return serv.orderByGPA().toString();
  }

  @GetMapping("/filter_name/{name}")
  public String filterByName(@PathVariable String name) {
    return serv.filterStudentsByName(name).toString();
  }

  @GetMapping("/filter_phone/{phone}")
  public String filterByPhone(@PathVariable String phone) {
    return serv.filterStudentsByPhoneNumber(phone).toString();
  }
}