package com.example.studentservice;

public class Profesor extends Persona {
  private double salario;
  private String[] materiasDictadas;

  public String[] getMateriasDictadas() {
    return materiasDictadas;
  }

  public double getSalario() {
    return salario;
  }
}
