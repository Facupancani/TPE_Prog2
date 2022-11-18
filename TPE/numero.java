package TPE;

public class numero extends elementoLista {

	public int numero;
	
	public numero(int numero){
		this.numero=numero;
	}
	
	@Override
	public String getParametro1() {
		return numero;
	}

	@Override
	public String getParametro2() {
		return null;
	}

	@Override
	public String getNombre() {
		return String.valueOf(numero);
	}

	@Override
	public String toString() {
		return "numero [numero=" + numero + "]";
	}

	
}
