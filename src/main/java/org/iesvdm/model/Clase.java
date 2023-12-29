package org.iesvdm.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Clase extends Curso{
    String nombreClase;
    HashSet<Profesor> profesores;
    HashSet<Estudiante> estudiantes;
    ArrayList<Tema> temas;

}
