package com.example.studentservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceEstudiante {
  static RepositorioEstudiante studentRepo = new RepositorioEstudiante();
  static List<Estudiante> filteredList = new ArrayList<>();

  public static List<Estudiante> listAllStudents() {
    return studentRepo.studentsList;
  }

  public static List<Estudiante> filterStudentsByName(String seekName) {
    filteredList.clear();
    for (Estudiante stud : studentRepo.studentsList) {
      if (stud.getNombre() == seekName) {
        filteredList.add(stud);
      }
    }
    return filteredList;
  }

  public static List<Estudiante> filterStudentsByPhoneNumber(String seekPhone) {
    filteredList.clear();
    for (Estudiante stud : studentRepo.studentsList) {
      if (stud.getNumeroCelular() == seekPhone) {
        filteredList.add(stud);
      }
    }
    return filteredList;
  }

  public static void main(String[] args) {
    List<Estudiante> all = listAllStudents();
    System.out.println(all);
    System.out.println("\n\n");

    List<Estudiante> nameFiltered = filterStudentsByName("Harry Potter");
    System.out.println(nameFiltered);
    System.out.println("\n\n");

    List<Estudiante> phoneFiltered = filterStudentsByPhoneNumber("+0000000012");
    System.out.println(phoneFiltered);
    System.out.println("\n\n");

    // System.out.println(filteredList);
  }

}
