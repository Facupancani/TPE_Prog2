package TPE;

public class materia extends elementoLista{

	public String nombreMateria;
	private lista<comision> listaComision;
	
	public materia(String Nombre){
		this.nombreMateria = Nombre;
		this.listaComision = new lista<comision>();
	}
	
	public void insertarComision(comision comision){
		this.listaComision.insertar(comision);
	}

	@Override
	public String getParametro1() {
		int contador = this.listaComision.cantHijos();
		return String.valueOf(contador);
	}

	@Override
	public String getParametro2() {
		return nombreMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public lista<comision> getListaComision() {
		return listaComision;
	}

	public void setListaComision(lista<comision> listaComision) {
		this.listaComision = listaComision;
	}

	@Override
	public String toString() {
		return "materia [nombreMateria=" + nombreMateria + ", listaComision="
				+ listaComision + "]";
	}

	@Override
	public String getNombre() {
		return nombreMateria;
	}
	
	
}
