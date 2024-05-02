import java.util.ArrayList;
import java.util.List;

class ListaEstudiante {
    List<Estudiante> estudiantes;

    public ListaEstudiante() {
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20, 101L, 4.5));
        estudiantes.add(new Estudiante("María", 22, 102L, 4.1));
        estudiantes.add(new Estudiante("Carlos", 21, 103L, 3.8));
        estudiantes.add(new Estudiante("Rosa", 23, 101L, 4.5));
        estudiantes.add(new Estudiante("Luisa", 24, 102L, 4.1));
        estudiantes.add(new Estudiante("Camila", 21, 103L, 3.8));
    }

    public void calcularPromedios(List<Carrera> carreras) {
        for (Estudiante estudiante : estudiantes) {
            for (Carrera carrera : carreras) {
                if (estudiante.getCarrera().equals(carrera.getCodigo())) {
                    carrera.setPromedioNotas(carrera.getPromedioNotas() + estudiante.getPromedio());
                    carrera.setPromedioEdad(carrera.getPromedioEdad() + estudiante.getEdad());
                    break;
                }
            }
        }
        for (Carrera carrera : carreras) {
            int count = 0;
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getCarrera().equals(carrera.getCodigo())) {
                    count++;
                }
            }
            if (count > 0) {
                carrera.setPromedioNotas(carrera.getPromedioNotas() / count);
                carrera.setPromedioEdad(carrera.getPromedioEdad() / count);
            }
        }
    }
}