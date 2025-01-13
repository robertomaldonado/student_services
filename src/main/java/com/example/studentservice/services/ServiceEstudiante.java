package com.example.studentservice.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.studentservice.entities.Estudiante;
import com.example.studentservice.repository.RepositorioEstudiante;

public class ServiceEstudiante {

  RepositorioEstudiante studentRepo;
  List<Estudiante> filteredList;

  public ServiceEstudiante() {
    studentRepo = new RepositorioEstudiante();
    filteredList = new ArrayList<>();
  }

  public List<Estudiante> listAllStudents() {
    return this.studentRepo.studentsList;
  }

  public List<Estudiante> filterStudentsByName(String seekName) {
    this.filteredList.clear();
    for (Estudiante stud : this.studentRepo.studentsList) {
      if (stud.getNombre().equals(seekName)) {
        this.filteredList.add(stud);
      }
    }
    return this.filteredList;
  }

  public List<Estudiante> filterStudentsByPhoneNumber(String seekPhone) {
    this.filteredList.clear();
    for (Estudiante stud : studentRepo.studentsList) {
      if (stud.getNumeroCelular().equals(seekPhone)) {
        this.filteredList.add(stud);
      }
    }
    return this.filteredList;
  }

  public List<Estudiante> orderByGPA() {
    List<Estudiante> sortedList = studentRepo.studentsList.stream()
        .sorted(Comparator.comparing(Estudiante::getPromedioNotas).reversed())
        .collect(Collectors.toList());
    return sortedList;
  }

}
