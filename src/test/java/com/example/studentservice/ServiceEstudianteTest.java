package com.example.studentservice;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.studentservice.entities.Estudiante;
import com.example.studentservice.repository.RepositorioEstudiante;
import com.example.studentservice.services.ServiceEstudiante;

import org.mockito.InjectMocks;
import org.mockito.Mock;

@ExtendWith(MockitoExtension.class)
public class ServiceEstudianteTest {

  @Mock
  private RepositorioEstudiante student_repo;

  @InjectMocks
  private ServiceEstudiante serviceEstudiante;

  @Test
  void listAllStudents() {
    Estudiante estudiante_1 = new Estudiante("Harry", "+0000000012",
        "ds@hogwarts.edu", "Privet Dr", "Scotland", " X", "HG01", "Britain",
        "010", 2.9, new String[] { "Historia de la magia", "Alquimia" }, new String[] { "Sem Capa Invisible" });
    assertThat(serviceEstudiante.listAllStudents().getFirst()).isEqualTo(estudiante_1);

    var studentList = serviceEstudiante.listAllStudents();
    assertThat(studentList).isNotNull();
    assertThat(studentList.size()).isEqualTo(10);
  }

}
