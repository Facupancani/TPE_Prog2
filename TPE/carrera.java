package TPE;

public class carrera extends elementoLista{

	private String nombreCarrera;
	private lista<materia> listaMaterias;
	private lista<Alumno> listaAlumnoSuelto;
	
	public carrera(String Nombre){
		this.nombreCarrera = Nombre;
		this.listaMaterias = new lista<materia>();
		this.listaAlumnoSuelto = new lista<Alumno>();
	}

	public void insertarMateria(materia materia){
		this.listaMaterias.insertar(materia);
	}
	
	public void insertarAlumno(Alumno alumno){
		this.listaAlumnoSuelto.insertar(alumno);
	}
	
	@Override
	public String getParametro1() {
		int contador = this.listaMaterias.cantHijos() + this.listaAlumnoSuelto.cantHijos();
		return String.valueOf(contador);
	}

	@Override
	public String getParametro2() {
		return nombreCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public lista<materia> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(lista<materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

	public lista<Alumno> getListaAlumnoSuelto() {
		return listaAlumnoSuelto;
	}

	public void setListaAlumnoSuelto(lista<Alumno> listaAlumnoSuelto) {
		this.listaAlumnoSuelto = listaAlumnoSuelto;
	}

	@Override
	public String toString() {
		return "carrera [nombreCarrera=" + nombreCarrera + ", listaMaterias="
				+ listaMaterias + ", listaAlumnoSuelto=" + listaAlumnoSuelto
				+ "]";
	}

	@Override
	public String getNombre() {
		return nombreCarrera;
	}
	
	
}
