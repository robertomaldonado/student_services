package com.example.studentservice.entities;

public class Profesor extends Persona {
  private double salario;
  public String[] materiasDictadas;

  public Profesor() {
    super();
    this.salario = 1200.00;
    this.materiasDictadas = new String[] { "A1", "B2", "C3", "SE1", "SE12" };
  }

  public Profesor(String nombre, String numeroCelular, String correoElectronico,
      String direccion, String ciudad, String estado, String codigoPostal, String pais,
      double salario, String[] materias) {
    super(nombre, numeroCelular, correoElectronico,
        direccion, ciudad, estado, codigoPostal, pais);
    this.salario = salario;
    this.materiasDictadas = materias;
  }

  public String toString() {
    String prof_data = "PROF: " + salario
        + " Materias Dictadas: " + String.join(",", materiasDictadas)
        + "\n" + this.getNombre() + " "
        + this.getNumeroCelular() + " "
        + this.getCorreoElectronico() + "\n" + this.getDireccion();
    return prof_data;
  }

  public double getSalario() {
    return salario;
  }
}
