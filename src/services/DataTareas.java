package services;

import model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class DataTareas {

    private List< tareas> tareas;

    public DataTareas() {
        tareas = new ArrayList<>();
        // Agrega los doctores de ejemplo
        tareas.add(new tareas("1", "ejercicio de mate "));
        tareas.add(new tareas("3", "trabajo de naturales"));
    }

    public List<tareas> getDoctors() {
        return tareas;
    }

    public Tarea[] getTareas() {
    }

    public void agregarTarea(Tarea nuevaTarea) {
    }

    private class tareas {
        public tareas(String number, String trabajoDeNaturales) {
        }
    }
}
