package TPE;

public class comision extends elementoLista{
	
	private String nombreComision;
	private lista<Alumno> listaAlumnos;

	public comision(String Nombre){
		this.nombreComision = Nombre;
		this.listaAlumnos = new lista<Alumno>();
	}
	
	public void insertarAlumno(Alumno alumno){
		this.listaAlumnos.insertar(alumno);
	}
	

	public String getParametro1() {
		int contador = this.listaAlumnos.cantHijos();
		return String.valueOf(contador);
	}


	public String getParametro2() {
		return nombreComision;
	}


	public String getNombreComision() {
		return nombreComision;
	}


	public void setNombreComision(String nombreComision) {
		this.nombreComision = nombreComision;
	}


	public lista<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(lista<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}


	@Override
	public String toString() {
		return "comision [nombreComision=" + nombreComision + ", listaAlumnos="
				+ listaAlumnos + "]";
	}


	@Override
	public String getNombre() {
		return nombreComision;
	}

	
}
