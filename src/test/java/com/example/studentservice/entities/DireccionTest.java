package com.example.studentservice.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DireccionTest {
  Direccion aDireccion = new Direccion("Privet Dr", "Scotland", "X", "HG01", "Britain");

  @Test
  void testParamConstructor() {
    assertThat(aDireccion.getDireccion()).isEqualTo("Privet Dr");
    assertThat(aDireccion.getCiudad()).isEqualTo("Scotland");
    assertThat(aDireccion.getEstado()).isEqualTo("X");
    assertThat(aDireccion.getCodigoPostal()).isEqualTo("HG01");
  }
}
