![Java](https://img.shields.io/badge/java-23-red?logo=openjdk)
![SpringBoot](https://img.shields.io/badge/SpringBoot-3.4.1-green?logo=springboot)

# Student Services with Spring Boot

## Ejecución

Pasos para ejecutar la clase principal MainApplication:

En VScode, click izquierdo sobre la clase MainApplication, seleccionar opción "Correr Java".

En consola de comandos: Usar el comando ./mvnw spring-boot:run

Una vez ejecutando la aplicación, abrir su explorador favorito, e ir a:
localhost:8080/
Desde donde se tiene acceso a los siguientes endpoints:

- all_students:
  Retorna lista de todos los estudiantes
- filter_name/<un nombre para filtrar>:
  Filtrar la lista por nombre
- filter_name/<un numero de telefono para filtrar> (formato es: +1111111111):
  Filtrar la lista por numero de telefono
- sorted_gpa:
  Retorna lista ordenada por promedio

## Objetivo

Objetivo: Estructuras de clases Java y Python – Proyecto Maven Spring Boot
Utilización IDE, construcción de estructuras básicas de Java, manejo de colecciones.

- Construcción de las clases java, correspondientes al diagrama UML
- Definir el método constructor para cada una de las Clases: Persona, Dirección, Estudiante, Profesor
- Construir una colección java dentro de una nueva clase denominada RepositorioEstudiante, con 10 estudiantes nuevos
- Construir una nueva clase denominada ServiceEstudiante, y construya un
  método que:
  - Liste todos los estudiantes.
  - Filtre los estudiantes por el atributo nombre
  - Filtre los estudiantes por el atributo numeroCelular
  - Ordene los estudiantes por el atributo promedioNotas
- Construir los 4 servicios del punto 4 como servicios REST dentro del framework spring boot
