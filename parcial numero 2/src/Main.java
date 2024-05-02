public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        // Calculamos los promedios
        listaEstudiante.calcularPromedios(listaCarrera.carreras);

        // Mostramos la información de todos los estudiantes con sus respectivos promedios
        System.out.println("Información de los estudiantes:");
        for (Estudiante estudiante : listaEstudiante.estudiantes) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getEdad() + " años - Carrera: " + estudiante.getCarrera() + " - Promedio: " + estudiante.getPromedio());
        }


        // Mostramos la información de todas las carreras con promedios de los estudiantes en sus respectivas carreras
        System.out.println("\nInformación de las carreras con promedios:");
        for (Carrera carrera : listaCarrera.carreras) {
            System.out.println("Carrera: " + carrera.getNombre() + " - Promedio de notas: " + carrera.getPromedioNotas() + " - Promedio de edad: " + carrera.getPromedioEdad());
        }
    }
}
