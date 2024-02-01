package org.iesvdm.model;

import java.util.HashSet;

public class Profesor extends Usuario {
    HashSet<Asignatura> asignaturas;
    HashSet<Clase> clases;
}
