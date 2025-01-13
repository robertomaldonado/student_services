package com.example.studentservice.entities;

public class Persona {
  private String nombre;
  private String numeroCelular;
  private String correoElectronico;
  private Direccion direccion;

  public Persona() {
    this.nombre = "John Doe";
    this.numeroCelular = "+999999999";
    this.correoElectronico = "jdoe@institute.com";
    this.direccion = new Direccion();
  }

  public Persona(String nombre, String numeroCelular, String correoElectronico,
      String direccion, String ciudad, String estado, String codigoPostal, String pais) {
    this.nombre = nombre;
    this.numeroCelular = numeroCelular;
    this.correoElectronico = correoElectronico;
    this.direccion = new Direccion(direccion, ciudad, estado, codigoPostal, pais);
  }

  public String toString() {
    String persona_data = "PERSONA: " + nombre + " " + numeroCelular + " " + correoElectronico + "\n" + direccion;
    return persona_data;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public String getNombre() {
    return nombre;
  }

  public String getNumeroCelular() {
    return numeroCelular;
  }

  public Direccion getDireccion() {
    return direccion;
  }

  public void comprarPaseEstacionamiento() {

  }
}
