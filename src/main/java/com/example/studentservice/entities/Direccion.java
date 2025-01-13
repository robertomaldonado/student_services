package com.example.studentservice.entities;

import lombok.Data;

@Data
public class Direccion {
  private String direccion;
  private String ciudad;
  private String estado;
  private String codigoPostal;
  private String pais;

  public Direccion() {
    this.direccion = "Alguna calle";
    this.ciudad = "Alguna ciudad";
    this.estado = "Algun Estado";
    this.codigoPostal = "ABC123";
    this.pais = "Algun Pais";
  }

  public Direccion(String direccion, String ciudad, String estado, String codigoPostal, String pais) {
    this.direccion = direccion;
    this.ciudad = ciudad;
    this.estado = estado;
    this.codigoPostal = codigoPostal;
    this.pais = pais;
  }

  public String toString() {
    return "Direccion: " + direccion + ", " + ciudad + ", " + estado + ", " + codigoPostal + ". " + pais;
  }

}
