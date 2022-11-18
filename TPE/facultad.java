package TPE;

public class facultad extends elementoLista{

	private String nombreFacultad;
	private lista<carrera> listaCarreras;
	private lista<Alumno> listaAlumnoSuelto;
	
	public facultad(String Nombre){
		this.nombreFacultad = Nombre;
		this.listaCarreras = new lista<carrera>();
		this.listaAlumnoSuelto = new lista<Alumno>();
	}
	
	public void insertarCarrera(carrera carrera){
		this.listaCarreras.insertar(carrera);
	}
	
	public void insertarAlumno(Alumno alumno){
		this.listaAlumnoSuelto.insertar(alumno);
	}
	
	@Override
	public String getParametro1() {
		int contador = this.listaCarreras.cantHijos() + this.listaAlumnoSuelto.cantHijos();
		return String.valueOf(contador);
	}

	@Override
	public String getParametro2() {
		return nombreFacultad;
	}

	public String getNombreFacultad() {
		return nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	public lista<carrera> getListaCarreras() {
		return listaCarreras;
	}

	public void setListaCarreras(lista<carrera> listaCarreras) {
		this.listaCarreras = listaCarreras;
	}

	public lista<Alumno> getListaAlumnoSuelto() {
		return listaAlumnoSuelto;
	}

	public void setListaAlumnoSuelto(lista<Alumno> listaAlumnoSuelto) {
		this.listaAlumnoSuelto = listaAlumnoSuelto;
	}

	@Override
	public String toString() {
		return "facultad [nombreFacultad=" + nombreFacultad
				+ ", listaCarreras=" + listaCarreras + ", listaAlumnoSuelto="
				+ listaAlumnoSuelto + "]";
	}

	@Override
	public String getNombre() {
		return nombreFacultad;
	}
	
	
}
