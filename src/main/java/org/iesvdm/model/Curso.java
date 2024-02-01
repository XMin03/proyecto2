package org.iesvdm.model;

import org.iesvdm.notUsed.Asignatura;

import java.util.HashSet;

public class Curso extends Asignatura {
    String nombreCurso;
    HashSet<Profesor> profesores;

}
