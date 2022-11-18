package TPE;

public class lista<T> {

	private nodo<T> raiz;
	
	public lista(){
		raiz = null;
	}
	
	void insertar(elementoLista nuevoElemento){
		//Creo el nodo y le inserto la informacion
        nodo<T> nuevo = new nodo<T>(nuevoElemento);

      
        if (raiz == null) {
            raiz = nuevo;
        } else if(raiz != null) {
        
        	//Reviso si tengo que insertarlo en el primer elemento
            if ( raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro1()) > 0) {
                nuevo.sig = raiz;
                raiz = nuevo;
            }
            
            nodo<T> reco = raiz;
            nodo<T> ant = reco;
            
            //Entro en while hasta que encuentre la posicion o llegue al final de la lista
            while ( (raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro1()) < 0) && (reco.sig != null) ) {
            	reco = reco.sig;
            }       
            
            if (raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro1()) > 0) {
            	nuevo.sig = ant.sig;
            	ant.sig = nuevo;
            }
            
            if(((raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro1())) < 0) && reco.sig == null){
            	reco.sig = nuevo;
            }
            
            
            //si encuentro apellidos iguales, ordeno por nombre
            if ((raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro1())) == 0 ) {		
                	while( (raiz.elemento.getParametro2().compareTo(nuevoElemento.getParametro2()) < 0) && (reco.sig != null) && (raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro1()) == 0 )){
                		reco = reco.sig;
                	}
                	if (raiz.elemento.getParametro2().compareTo(nuevoElemento.getParametro2()) > 0){	
	                	nuevo.sig = ant.sig;
	                	ant.sig = nuevo;
                	}
                	if( (raiz.elemento.getParametro2().compareTo(nuevoElemento.getParametro2()) < 0) && (raiz.elemento.getParametro1().compareTo(nuevoElemento.getParametro2()) != 0 )){
                		nuevo.sig = reco.sig;
                		reco.sig = nuevo;
                	}
            }	
        
        }
        
	}
	
	//Elimina un nodo en una determinada posicion de la lista
    void eliminarPos(int pos){
    	int actual = 1;
    	nodo<T> reco = raiz;
    	nodo<T> atras = raiz;
    	
    	while((pos != actual) && (reco.sig != null)){
    		actual ++;
    		atras = reco;
    		reco = reco.sig;
    	}
    	if(pos == actual){
    		atras.sig = reco.sig;
    	}
    }
    
   
    void eliminaOcurrencia(nodo<T> ocurrencia){
    	if (raiz == null) {
            return;
        } 
    	else{
        	if(ocurrencia.elemento == raiz.elemento){
        		raiz = raiz.sig;
        	}
        	else{
        		nodo<T> reco = raiz;
        		nodo<T> atras = raiz;
        		
        		//Entro en while hasta encontrar el dni o llegar al final de la misma
        		while(reco.sig != null){
	        		if(ocurrencia.elemento == reco.elemento){
	        			atras.sig = reco.sig;
	        		}
	        		atras = reco;
        			reco = reco.sig;
        		}
        	}
    	}
    }
    
    int posOcurrencia(nodo<T> ocurrencia){
    	if (raiz==null) {
            return 0;
        }
    	else{
    		int pos = 1;
    		if (raiz.elemento == ocurrencia.elemento){
    			return pos;
    		}
    		else{
    			nodo<T> reco = raiz;
        		
        		while((reco.elemento != ocurrencia.elemento) && (reco.sig != null)){
        			reco = reco.sig;
        			pos ++;
        		}
        		if(reco.elemento == ocurrencia.elemento){
        			return pos;
        		}
    		}
    	}
		return -1;
    }
    
    ///////////////////////
    
    public void mostrarLista(){
        MyIterator<T> iterator = new MyIterator<T>(this.raiz);
        while (iterator.hasNext()){
            elementoLista a = (elementoLista) iterator.next();
            System.out.println(a);
        }
    }
    
    	
    
   
    
}
