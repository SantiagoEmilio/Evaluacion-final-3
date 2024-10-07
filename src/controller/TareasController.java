package controller;

import model.Tarea;
import services.DataTareas;

public class TareasController {

        private DataTareas dataTareas;
        private TareasView view;

        public TareasController(DataTareas dataTareas, TareasView view) {
            this.dataTareas = dataTareas;
            this.view = view;
            cargarTareasEnVista();
        }

        public void cargarTareasEnVista() {
            for (Tarea tarea : dataTareas.getTareas()) {
                System.out.println(tarea.toString());
            }
        }

        public void agregarTarea(String titulo, String descripcion, String fechaLimite, Tarea.Estado estado) {
            Tarea nuevaTarea = new Tarea(titulo, descripcion, fechaLimite, estado);
            dataTareas.agregarTarea(nuevaTarea);
            cargarTareasEnVista();
        }

        public void eliminarTarea(String titulo) {
            dataTareas.eliminarTarea(titulo);
            cargarTareasEnVista();
        }

    private class TareasView {
    }
}
