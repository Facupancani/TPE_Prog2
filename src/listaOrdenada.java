
public class listaOrdenada {

	class Nodo {
		String nombre;
		String apellido;
		int edad;
		int DNI;
		String intereses;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    public listaOrdenada() {
        raiz = null;
    }
      
    void insertar(String Nombre, String Apellido, int Edad, int DNI, String Intereses)
    {
        Nodo nuevo = new Nodo ();
        nuevo.nombre = Nombre;
        nuevo.apellido = Apellido;
        nuevo.edad = Edad;
        nuevo.DNI = DNI;
        nuevo.intereses = Intereses;
        
        if (raiz==null) {
            raiz=nuevo;
        } else {
        	//compareTo() devuelve 0 si las cadenas son iguales, -1 si la primera es menor y 1 si es mayor
            if ((Apellido.compareTo(raiz.apellido)) == -1) {
                nuevo.sig=raiz;
                raiz=nuevo;
            } else {
                Nodo reco=raiz;
                Nodo atras=raiz;
                while ( (((Apellido.compareTo(reco.apellido)) == -1) || ((Apellido.compareTo(reco.apellido)) == 0)) && reco.sig!=null) {
                    atras=reco;
                    reco=reco.sig;
                }
                if ((Apellido.compareTo(reco.apellido)) == -1) {
                    reco.sig = nuevo;
                } else {
                    nuevo.sig = reco;
                    atras.sig = nuevo;
                }
            }
        }
    }

    public void imprimir () {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print (
            				   reco.nombre + 
            				   reco.apellido + 
            				   reco.edad + 
            				   reco.DNI + 
            				   reco.intereses
            				   );
            reco = reco.sig;
        }
        System.out.println();
    }
    
}
