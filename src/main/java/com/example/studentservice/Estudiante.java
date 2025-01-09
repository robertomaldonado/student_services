package com.example.studentservice;

public class Estudiante extends Persona {
  private String numeroEstudiante;
  private double promedioNotas;

  public String[] listadoAsignaturas;
  public String[] seminariosTomados;

  public Estudiante() {
    super();
    this.numeroEstudiante = "NEWSTUD";
    this.promedioNotas = 0.0;
    this.listadoAsignaturas = new String[] { "A1", "B2", "C3" };
    this.seminariosTomados = new String[] { "SE1", "SE12" };
  }

  public Estudiante(String nombre, String numeroCelular, String correoElectronico,
      String direccion, String ciudad, String estado, String codigoPostal, String pais,
      String codigo, double gpa, String[] asignaturas, String[] seminarios) {
    super(nombre, numeroCelular, correoElectronico,
        direccion, ciudad, estado, codigoPostal, pais);
    this.numeroEstudiante = codigo;
    this.promedioNotas = gpa;
    this.listadoAsignaturas = asignaturas;
    this.seminariosTomados = seminarios;
  }

  public String toString() {
    String student_data = "| STUD: " + numeroEstudiante + ", GPA: " + promedioNotas + " "
        + "Listado asignaturas: " + String.join(",", listadoAsignaturas)
        + " Seminarios tomados: " + String.join(",", seminariosTomados)
        + "\n" + this.getNombre() + " "
        + this.getNumeroCelular() + " "
        + this.getCorreoElectronico() + "\n" + this.getDireccion() + "|\n";
    return student_data;
  }

  public String getNumeroEstudiante() {
    return numeroEstudiante;
  }

  public double getPromedioNotas() {
    return promedioNotas;
  }

}
