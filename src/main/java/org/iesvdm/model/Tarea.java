package org.iesvdm.model;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Tarea {
    String title;
    int valor;
    int numIntento;
    LocalDateTime fechaEntrega;
    boolean publicado;
    HashSet<Fase> fases;
}
