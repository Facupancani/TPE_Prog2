
public class listaOrdenada {

	class Nodo {
		Alumno alumno;
		int info;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    public listaOrdenada() {
        raiz = null;
    }
      
    void insertar(Alumno nuevoAlumno)
    {
    	//Creo el nodo e inserto la informacion
        Nodo nuevo = new Nodo ();
        nuevo.alumno = nuevoAlumno;

        
        //Reviso que la lista no este vacia
        if (raiz==null) {
            raiz=nuevo;
        } else {
        	//compareTo() devuelve 0 si las cadenas son iguales, -1 si la primera es menor y 1 si es mayor
        	
        	//Reviso si tengo que insertarlo en el primer elemento
            if ((nuevoAlumno.apellido.compareTo(raiz.alumno.apellido)) == -1) {
                nuevo.sig=raiz;
                raiz=nuevo;
            } else {
                Nodo reco = raiz;
                Nodo atras = raiz;
                // Entro en while hasta que encuentre la posicion o llegue al final de la lista
                while ( ((nuevoAlumno.apellido.compareTo(reco.alumno.apellido)) == -1) && (reco.sig != null)) {
                    atras=reco;
                    reco=reco.sig;
                }
                
                //Inserto el elemento al salir del while
                
                //si son iguales comparo por nombre
                if ((nuevoAlumno.apellido.compareTo(reco.alumno.apellido)) == 0 ) {
                	while((nuevoAlumno.apellido.compareTo(reco.alumno.apellido) == -1) && (reco.sig != null)){
                		atras = reco;
                		reco = reco.sig;
                	}if((nuevoAlumno.apellido.compareTo(reco.alumno.apellido) == -1)){
                		reco.sig = nuevo;
                	}
                }
                
                if ((nuevoAlumno.apellido.compareTo(reco.alumno.apellido)) == 1) {
                    reco.sig = nuevo;
                } else {
                    nuevo.sig = reco;
                    atras.sig = nuevo;
                }
            }
        }
    }
    
    //Elimina un nodo en una determinada posicion de la lista
    void eliminarPos(int pos){
    	int actual = 0;
    	Nodo reco = raiz;
    	Nodo atras = raiz;
    	while((pos != actual) && (reco.sig != null)){
    		pos ++;
    		actual ++;
    		atras = reco;
    		reco = reco.sig;
    	}
    	if(pos == actual){
    		atras.sig = reco.sig;
    	}
    }

    
    void eliminaOcurrencia(int ocurrencia){
    	if (raiz==null) {
            return;
        } 
    	else{
        	if(ocurrencia == raiz.info){
        		raiz = raiz.sig;
        	}
        	else{
        		Nodo reco = raiz;
        		Nodo atras = raiz;
        		
        		//Entro en while hasta encontrar el dni o llegar al final de la misma
        		while(reco.sig != null){
	        		if(ocurrencia == reco.info){
	        			atras.sig = reco.sig;
	        		}
	        		atras = reco;
        			reco = reco.sig;
        		}
        	}
    	}
    }
    
    int posOcurrencia(int ocurrencia){
    	if (raiz==null) {
            return 0;
        }
    	else{
    		int pos = 1;
    		if (raiz.info == ocurrencia){
    			return pos;
    		}
    		else{
    			Nodo reco = raiz;
        		Nodo atras = raiz;
        		
        		while((reco.info != ocurrencia) && (reco.sig != null)){
        			atras = reco;
        			reco = reco.sig;
        			pos ++;
        		}
        		if(reco.info == ocurrencia){
        			return pos;
        		}
    		}
    	}
		return -1;
    }
    
    //Elimina un alumno de la lista segun el dni dado
    void eliminarDNI(int dni){
    	//Si la lista esta vacia, salgo de la funcion
    	if (raiz==null) {
            return;
            
            //Reviso si el elemento a eliminar es el primero en la lista
        } else {
        	if(dni == raiz.alumno.DNI){
        		raiz = raiz.sig;
        	}
        	else{
        		Nodo reco = raiz;
        		Nodo atras = raiz;
        		
        		//Entro en while hasta encontrar el dni o llegar al final de la misma
        		while( (dni != reco.alumno.DNI) && (reco.sig != null) ){
        			atras = reco;
        			reco = reco.sig;
        		}
        		if(dni == reco.alumno.DNI){
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
            System.out.print (reco.alumno);
            reco = reco.sig;
        }
        System.out.println();
    }
    
}
