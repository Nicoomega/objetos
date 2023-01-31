package mundo;

public class Curso {

	private Estudiante[] estudiantes;

	public Curso() {
		estudiantes = new Estudiante[24];
		Estudiante nuevoEstudiante = new Estudiante("202312345", "María Camila Ángel", "IIND", 21);
		estudiantes[0] = nuevoEstudiante;
	
		System.out.println(estudiantes[0].getNombre());
		
	}
	public static void main(String[] args) {
		Curso c = new Curso();
	}
	
	
	
	
}
