package org.iesvdm.model;

import java.util.HashSet;

public class Profesor extends Usuario {
    HashSet<Curso> cursos;
    HashSet<Clase> clases;
}
