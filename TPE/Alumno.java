package TPE;


public class Alumno extends elementoLista {

	String nombre;
	String apellido;
	int edad;
	int DNI;
	String intereses;

	public String getParametro1(){
		return apellido;
	}
	public String getParametro2(){
		return nombre;
	}
	
	
	public Alumno(String Nombre, String Apellido, int Edad, int dni, String Intereses){
		nombre = Nombre;
		apellido = Apellido;
		edad = Edad;
		DNI = dni;
		intereses = Intereses;
	}
    
	public String toString() {
		return "nombre: "+ nombre + " -Apellido: " + apellido + " -Edad: " + edad + " -DNI: " + DNI + " -Intereses: " + intereses;
	}
	
	public int comparar (Alumno alumno){
		String actual = this.getApellido().substring(0, 1);
		String comparada = alumno.getApellido().substring(0, 1);
    	return actual.compareTo(comparada);
    }
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}


}
