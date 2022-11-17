
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
      
    
    void insertar(Alumno nuevoAlumno){
    	
    	//Creo el nodo y le inserto la informacion
        Nodo nuevo = new Nodo ();
        nuevo.alumno = nuevoAlumno;
        nuevo.info = 1;
        System.out.println("se inserta a: " + nuevo.alumno.nombre);

        
        //Si la lista esta vacia lo inserto en la raiz de la lista.
        if (raiz == null) {
            raiz = nuevo;
            System.out.println("se inserta en el primer elemento");
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
		                	System.out.println("se inserta al encontrar un mayor");
		                }
		                
		                if((reco.alumno.comparar(nuevoAlumno) < 0) && reco.sig == null){
		                	reco.sig = nuevo;
		                	System.out.println("se inserta al final de la lista");
		                }
		                
		                
		                //si encuentro apellidos iguales, ordeno por nombre
		                if (reco.alumno.comparar(nuevoAlumno) == 0 ) {		
		                	System.out.println("apellidos iguales");
			                	while( (reco.alumno.comparar(nuevoAlumno) > 0) && (reco.sig != null)){
			                		reco = reco.sig;
			                	}
			                	nuevo.sig = reco.sig;
			                	reco.sig = nuevo;
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
        		
        		while((reco.info != ocurrencia) && (reco.sig != null)){
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
            System.out.println(reco.alumno.toString());
            reco = reco.sig;
        }
    }
    
    
    public static void main(String[] args){
    	listaOrdenada lista = new listaOrdenada();
    	Alumno juan = new Alumno("juan", "gutierrez", 21, 42647475, "futbol");
    	Alumno pedro = new Alumno("pedro", "dieguez", 23, 42645367, "rugby");
    	Alumno jose = new Alumno("jose", "alvarez", 20, 426754367, "rugby");
    	Alumno maria = new Alumno("maria", "ramirez", 19, 42634367, "rugby");
    	lista.insertar(juan);
    	lista.insertar(pedro);
    	lista.insertar(maria);
    	lista.insertar(jose);
    	lista.imprimir();
    	return;
    }
}

//compareTo() devuelve 0 si las cadenas son iguales, un numero negatico si la primera es menor y positivo si es mayor
