package org.iesvdm.model;

import java.util.ArrayList;

public class User {
    enum Rol {ESTUDIANTE,PROFESOR,ADMIN}
    int id;
    String nombre;
    String apellido1;
    String apellido2;
    Rol rol;
    ArrayList<Asignatura> asignaturas;
}
