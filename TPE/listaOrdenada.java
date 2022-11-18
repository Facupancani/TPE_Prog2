package TPE;


public class listaOrdenada {

	class Nodo {
		Alumno alumno;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    public listaOrdenada() {
        raiz = null;
    }
      
    
    void insertar(Alumno nuevoAlumno){
    	
    	//Creo el nodo y le inserto la informacion
        Nodo nuevo = new Nodo();
        nuevo.alumno = nuevoAlumno;

        
        //Si la lista esta vacia lo inserto en la raiz de la lista.
        if (raiz == null) {
            raiz = nuevo;
        } else if(raiz != null) {

        	//Reviso si tengo que insertarlo en el primer elemento
            if ( raiz.alumno.comparar(nuevoAlumno) > 0) {
                nuevo.sig = raiz;
                raiz = nuevo;
                return;
            }
            
		                Nodo reco = raiz;
		                Nodo ant = reco;
		                
		                //Entro en while hasta que encuentre la posicion o llegue al final de la lista
		                while ( (reco.alumno.comparar(nuevoAlumno) < 0) && (reco.sig != null) ) {
		                	reco = reco.sig;
		                }       
		                
		                if (reco.alumno.comparar(nuevoAlumno) > 0) {
		                	nuevo.sig = ant.sig;
		                	ant.sig = nuevo;
		                }
		                
		                if((reco.alumno.comparar(nuevoAlumno) < 0) && reco.sig == null){
		                	reco.sig = nuevo;
		                }
		                
		                
		                //si encuentro apellidos iguales, ordeno por nombre
		                if (reco.alumno.comparar(nuevoAlumno) == 0 ) {		
			                	while( (reco.alumno.nombre.compareTo(nuevoAlumno.nombre) < 0) && (reco.sig != null) && (reco.sig.alumno.comparar(nuevoAlumno) == 0 )){
			                		reco = reco.sig;
			                	}
			                	if (reco.alumno.nombre.compareTo(nuevoAlumno.nombre) > 0){	
				                	nuevo.sig = ant.sig;
				                	ant.sig = nuevo;
			                	}
			                	if( (reco.alumno.nombre.compareTo(nuevoAlumno.nombre) < 0) && (reco.sig.alumno.comparar(nuevoAlumno) != 0 )){
			                		nuevo.sig = reco.sig;
			                		reco.sig = nuevo;
			                	}
			                	
		                }	            
        }
    }
    
    //Elimina un nodo en una determinada posicion de la lista
    void eliminarPos(int pos){
    	int actual = 1;
    	Nodo reco = raiz;
    	Nodo atras = raiz;
    	while((pos != actual) && (reco.sig != null)){
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
        	if(ocurrencia == raiz.alumno.edad){
        		raiz = raiz.sig;
        	}
        	else{
        		Nodo reco = raiz;
        		Nodo atras = raiz;
        		
        		//Entro en while hasta encontrar el dni o llegar al final de la misma
        		while(reco.sig != null){
	        		if(ocurrencia == reco.alumno.edad){
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
    		if (raiz.alumno.edad == ocurrencia){
    			return pos;
    		}
    		else{
    			Nodo reco = raiz;
        		
        		while((reco.alumno.edad != ocurrencia) && (reco.sig != null)){
        			reco = reco.sig;
        			pos ++;
        		}
        		if(reco.alumno.edad == ocurrencia){
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
            System.out.println(reco.alumno.toString());
            reco = reco.sig;
        }
        System.out.println("----------------");
    }
    
    
    public static void main(String[] args){
    	listaOrdenada lista = new listaOrdenada();
    	Alumno juan = new Alumno("juan", "gutierrez", 21, 32647475, "futbol");
    	Alumno alan = new Alumno("alan", "dieguez", 19, 40634353, "rugby");
    	Alumno jose = new Alumno("jose", "alvarez", 20, 436754367, "voley");
    	Alumno pedro = new Alumno("pedro", "dieguez", 23, 52645367, "basquet");
    	Alumno nico = new Alumno("nico", "peder", 19, 12345678, "paddle");
    	lista.insertar(juan);
    	lista.insertar(pedro);
    	lista.insertar(jose);
    	lista.insertar(alan);
    	lista.insertar(nico);
    	lista.imprimir();
    	return;
    }
}

//compareTo() devuelve 0 si las cadenas son iguales, un numero negatico si la primera es menor y positivo si es mayor
