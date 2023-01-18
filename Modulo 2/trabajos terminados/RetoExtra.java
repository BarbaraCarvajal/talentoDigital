package trabajosTerminados;
import java.util.ArrayList;
import java.util.Collections;

public class RetoExtra {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Estudiante 1");
        alumnos.add("Estudiante 2");
        alumnos.add("Estudiante 3");
        alumnos.add("Estudiante 4");
        alumnos.add("Estudiante 5");
        alumnos.add("Estudiante 6");
        alumnos.add("Estudiante 7");
        alumnos.add("Estudiante 8");
        alumnos.add("Estudiante 9");
        alumnos.add("Estudiante 10");
        alumnos.add("Estudiante 11");
        alumnos.add("Estudiante 12");
        alumnos.add("Estudiante 13");
        alumnos.add("Estudiante 14");
        //students.add("Estudiante 15");
        
        // Desordenar la lista de estudiantes
        Collections.shuffle(alumnos);
        
        // Emparejar los estudiantes en parejas
        for (int i = 0; i < alumnos.size(); i += 2) {
            System.out.println(alumnos.get(i) + " y " + alumnos.get(i + 1));
            
        }
    }
}
