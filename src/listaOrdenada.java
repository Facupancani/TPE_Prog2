
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
    	//Creo el nodo e inserto la informacion
        Nodo nuevo = new Nodo ();
        nuevo.nombre = Nombre;
        nuevo.apellido = Apellido;
        nuevo.edad = Edad;
        nuevo.DNI = DNI;
        nuevo.intereses = Intereses;
        
        //Reviso que la lista no este vacia
        if (raiz==null) {
            raiz=nuevo;
        } else {
        	//compareTo() devuelve 0 si las cadenas son iguales, -1 si la primera es menor y 1 si es mayor
        	
        	//Reviso si tengo que insertarlo en el primer elemento
            if ((Apellido.compareTo(raiz.apellido)) == -1) {
                nuevo.sig=raiz;
                raiz=nuevo;
            } else {
                Nodo reco = raiz;
                Nodo atras = raiz;
                // Entro en while hasta que encuentre la posicion o llegue al final de la lista
                while ( (((Apellido.compareTo(reco.apellido)) == -1) || ((Apellido.compareTo(reco.apellido)) == 0)) && (reco.sig != null)) {
                    atras=reco;
                    reco=reco.sig;
                }
                
                //Inserto el elemento al salir del while
                if ((Apellido.compareTo(reco.apellido)) == 1) {
                    reco.sig = nuevo;
                } else {
                    nuevo.sig = reco;
                    atras.sig = nuevo;
                }
            }
        }
    }

    
    void eliminar(int dni){
    	//Si la lista esta vacia, salgo de la funcion
    	if (raiz==null) {
            return;
            
            //Reviso si el elemento a eliminar es el primero en la lista
        } else {
        	if(dni == raiz.DNI){
        		raiz = raiz.sig;
        	}
        	else{
        		Nodo reco = raiz;
        		Nodo atras = raiz;
        		
        		//Entro en while hasta encontrar el dni o llegar al final de la misma
        		while( (dni != reco.DNI) && (reco.sig != null) ){
        			atras = reco;
        			reco = reco.sig;
        		}
        		if(dni == reco.DNI){
        			if(reco.sig != null){
        				atras.sig = reco.sig;
        			}else{
        				atras.sig = null;
        			}
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
