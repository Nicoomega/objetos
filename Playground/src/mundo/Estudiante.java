package mundo;

public class Estudiante {

	private String codigo;
	private String nombre;
	private String carrera;
	private double promedio;
	private int edad;
	
	//************CONSTRUCTOR*****************//
	
	public Estudiante (String codigoP, String nombreP, String carreraP, int edadP) {
		promedio = 0.0;
		carrera = carreraP;
		edad = edadP;
		nombre = nombreP;
		codigo = codigoP;
	}
	
	//************CONSTRUCTOR*****************//
	
	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	/**
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}
	/**
	 * @param promedio the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
}
