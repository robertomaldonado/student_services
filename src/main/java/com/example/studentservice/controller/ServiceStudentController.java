package com.example.studentservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentservice.entities.Estudiante;
import com.example.studentservice.services.ServiceEstudiante;

@RestController
public class ServiceStudentController {

  ServiceEstudiante serv = new ServiceEstudiante();

  @GetMapping("/")
  public String index() {
    return "<h1>Student Services</h1>\n<h2>Status: </h2> Running...";
  }

  @GetMapping("/all_students")
  public ResponseEntity<List<Estudiante>> listAllStudents() {
    return ResponseEntity.ok(serv.listAllStudents());
  }

  @GetMapping("/sorted_gpa")
  public ResponseEntity<List<Estudiante>> listSortedByGPA() {
    return ResponseEntity.ok(serv.orderByGPA());
  }

  @GetMapping("/filter_name/{name}")
  public ResponseEntity<List<Estudiante>> filterByName(@PathVariable String name) {
    return ResponseEntity.ok(serv.filterStudentsByName(name));
  }

  @GetMapping("/filter_phone/{phone}")
  public ResponseEntity<List<Estudiante>> filterByPhone(@PathVariable String phone) {
    return ResponseEntity.ok(serv.filterStudentsByPhoneNumber(phone));
  }
}