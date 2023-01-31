package mundo;

import java.util.ArrayList;

public class Curso2 {

	private ArrayList<Estudiante> estudiantes;
	
	public Curso2() {
		estudiantes = new ArrayList<Estudiante>();
		Estudiante nuevoEstudiante = new Estudiante("202312345", "Felipe Ángel", "IIND", 21);
		estudiantes.add(nuevoEstudiante);
		System.out.println(estudiantes.get(0).getNombre());
	}
	
	
	public static void main(String[] args) {
		Curso2 c2= new Curso2();
	}

}
