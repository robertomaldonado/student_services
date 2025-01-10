package com.example.studentservice;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEstudiante {
  List<Estudiante> studentsList = new ArrayList<Estudiante>();

  public String toString() {
    return this.studentsList.toString();
  }

  public RepositorioEstudiante() {
    Estudiante estudiante_1 = new Estudiante(
        "Harry", "+0000000012",
        "ds@hogwarts.edu", "Privet Dr", "Scotland", " X", "HG01", "Britain",
        "010", 2.9, new String[] { "Historia de la magia", "Alquimia" }, new String[] { "Sem Capa Invisible" });
    Estudiante estudiante_2 = new Estudiante(
        "Ron", "+0000000012",
        "rw@hogwarts.edu", "Somewhere", "Scotland", " X", "HG01", "Britain",
        "011", 4.0, new String[] { "Herbologia" }, new String[] { "Sem Defensa Compleja" });
    Estudiante estudiante_3 = new Estudiante(
        "Hermione", "+1233451234",
        "hg@hogwarts.edu", "12 Elsewhere", "Scotland", " X", "HG01", "Britain",
        "012", 2.3, new String[] { "Pociones" }, new String[] { "Sem Ataque Complejo" });
    Estudiante estudiante_4 = new Estudiante(
        "Neville", "+1123121234",
        "nl@hogwarts.edu", "14 Buho loco", "Scotland", " X", "HG01", "Britain",
        "013", 1.5, new String[] { "Pociones", "Hechizos" }, new String[] { "Sem Defensa Artes Oscuras" });
    Estudiante estudiante_5 = new Estudiante(
        "Rubeus", "+0000001231",
        "rh@hogwarts.edu", "Lechuza", "Scotland", " X", "HG01", "Britain",
        "014", 3.3, new String[] { "Alquimia", "Transformaciones" }, new String[] { "Sem Astrofísica" });
    Estudiante estudiante_6 = new Estudiante(
        "Fred", "+1231231234",
        "fw@hogwarts.edu", "Tombabill Av", "Scotland", " X", "HG01", "Britain",
        "015", 2.5, new String[] { "Pociones Avanzadas", "Derecho Muggle" }, new String[] { "Sem Astrofísica" });
    Estudiante estudiante_7 = new Estudiante(
        "George", "+1231231234",
        "gw@hogwarts.edu", "Strider St", "Scotland", " X", "HG01", "Britain",
        "016", 1.4, new String[] { "Derecho Muggle", "Quiddich" }, new String[] { "Sem Astrologia", "Sem Quiddich" });
    Estudiante estudiante_8 = new Estudiante(
        "Draco", "+01201201234",
        "dm@hogwarts.edu", "Slough Av", "Scotland", " X", "HG01", "Britain",
        "017", 3.2, new String[] { "Herbologia" }, new String[] { "Sem Quiddich" });
    Estudiante estudiante_9 = new Estudiante(
        "Dudley", "+3213214321",
        "dd@hogwarts.edu", "Hampton Rd", "Scotland", " X", "HG01", "Britain",
        "018", 3.0, new String[] { "Mate", "Química" }, new String[] { "Sem Astrologia" });
    Estudiante estudiante_10 = new Estudiante(
        "Rowina", "+3213214322",
        "rr@hogwarts.edu", "Pinespray", "Scotland", " X", "HG01", "Britain",
        "019", 3.99, new String[] { "Conjuros", "Criaturas magicas" }, new String[] { "Sem Astrologia" });

    this.studentsList.add(estudiante_1);
    this.studentsList.add(estudiante_2);
    this.studentsList.add(estudiante_3);
    this.studentsList.add(estudiante_4);
    this.studentsList.add(estudiante_5);
    this.studentsList.add(estudiante_6);
    this.studentsList.add(estudiante_7);
    this.studentsList.add(estudiante_8);
    this.studentsList.add(estudiante_9);
    this.studentsList.add(estudiante_10);

  }

}
