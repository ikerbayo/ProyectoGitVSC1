public class tarea {
    // Método para imprimir una lista de tareas
    public void imprimirTareas() {
        System.out.println("Lista de tareas:");
        System.out.println("- Tarea 1");
        System.out.println("- Tarea 2");
    }

    // Método para agregar una tarea (simulado con un print)
    public void agregarTarea(String tarea) {
        System.out.println("Tarea agregada: " + tarea);
    }

    public static void main(String[] args) {
        Tareas tareas = new Tareas();
        tareas.imprimirTareas();
        tareas.agregarTarea("Nueva Tarea");
    }
}