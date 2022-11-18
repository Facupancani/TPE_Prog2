package TPE;

public class Main {

    public static void main(String[] args){
    	lista lista = new lista();
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
    	lista.mostrarLista();
    }
    
}
