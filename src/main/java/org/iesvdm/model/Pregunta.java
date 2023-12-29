package org.iesvdm.model;

import java.util.HashSet;

abstract class Pregunta {
    int valor;
    String pregunta;
    HashSet<Respuesta> respuestas;
}