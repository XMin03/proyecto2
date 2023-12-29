package org.iesvdm.model;

import java.util.HashSet;
import java.util.Objects;

public class Fase {
    enum Nivel{FACIL,INTERMEDIO,DIFICIL};
    HashSet<Pregunta> preguntas;
    Nivel nivel;
    boolean permiso;
    int valor;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fase fase = (Fase) o;
        return nivel == fase.nivel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivel);
    }
}
