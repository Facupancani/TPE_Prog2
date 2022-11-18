package TPE;

public class nodo<T> {

	public elementoLista elemento;
	public nodo<T> sig;
	
	public nodo(elementoLista Elemento){
		this.elemento = Elemento;
		this.sig = null;
	}
	
	public void apuntar(nodo<T> apuntado){
		this.sig = apuntado;
	}
	
	public nodo<T> getSiguiente(){
		return this.sig;
	}
	
	public elementoLista getValor(){
		return this.elemento;
	}
	
}
