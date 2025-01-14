package com.example.studentservice.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PersonaTest {
  Persona testPerson = new Persona("Murdok", "+6666666666",
      "mm@gorillaz.com", "Melancholy Hill", "Gorillaz", "G", "GZ00", "Plastic Beach");

  @Test
  void testParamPersonaConstructor() {
    assertThat(testPerson.getNombre()).isEqualTo("Murdok");
    assertThat(testPerson.getNumeroCelular()).isEqualTo("+6666666666");
    assertThat(testPerson.getCorreoElectronico()).isEqualTo("mm@gorillaz.com");
    assertThat(testPerson.getDireccion()).isNotNull();
    assertThat(testPerson.getDireccion().getDireccion()).isEqualTo("Melancholy Hill");
    assertThat(testPerson.getDireccion().getCiudad()).isEqualTo("Gorillaz");
    assertThat(testPerson.getDireccion().getEstado()).isEqualTo("G");
    assertThat(testPerson.getDireccion().getCodigoPostal()).isEqualTo("GZ00");
    assertThat(testPerson.getDireccion().getPais()).isEqualTo("Plastic Beach");

  }
}
