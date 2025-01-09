package com.example.studentservice;

public class Estudiante extends Persona {
  private String numeroEstudiante;
  private double promedioNotas;

  public String[] listadoAsignaturas;
  public String[] seminariosTomados;

  public String[] getListadoAsignaturas() {
    return listadoAsignaturas;
  }

  public String getNumeroEstudiante() {
    return numeroEstudiante;
  }

  public double getPromedioNotas() {
    return promedioNotas;
  }

  public String[] getSeminariosTomados() {
    return seminariosTomados;
  }

}
