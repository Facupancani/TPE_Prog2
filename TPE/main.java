package TPE;

public class Main {

    public static void main(String[] args){
    	/*
    	lista uni = new lista();
    	facultad exactas = new facultad("exactas");
    	
    	carrera sistemas = new carrera("Sistemas");
    	carrera TUDAI = new carrera("TUDAI");
    	
    	materia prog = new materia("programacion");
    	materia prog2 = new materia("programacion");
    	
    	comision uno = new comision("1");
    	comision dos = new comision("2");
    	

    	Alumno juan = new Alumno("juan", "gutierrez", 21, 32647475, "futbol");
    	Alumno alan = new Alumno("alan", "dieguez", 19, 40634353, "rugby");
    	Alumno jose = new Alumno("jose", "alvarez", 20, 436754367, "voley");
    	Alumno pedro = new Alumno("pedro", "dieguez", 23, 52645367, "basquet");
    	Alumno nico = new Alumno("nico", "peder", 19, 12345678, "paddle");
    	

    	//universidad
    	
    	//facultad
    	uni.insertar(exactas);
    	uni.insertar(nico);
    	
    	//carrera
    	exactas.insertarCarrera(sistemas);
    	exactas.insertarCarrera(TUDAI);
    	
    	//materia
    	sistemas.insertarMateria(prog);
    	sistemas.insertarMateria(prog2);
    	TUDAI.insertarMateria(prog);
    	
    	//comision
    	prog.insertarComision(uno);
    	prog.insertarComision(dos);
    	prog2.insertarComision(dos);
    	
    	//alumno
    	uno.insertarAlumno(nico);
    	uno.insertarAlumno(alan);
    	uno.insertarAlumno(jose);
    	dos.insertarAlumno(juan);
    	dos.insertarAlumno(pedro);
    	
    	uni.mostrarLista();
    	*/
    	
    	/* PUNTO A
    	 * 
    	 */
    	
    	lista<numero> listaNumeros = new lista<numero>();
    	numero diez = new numero(10);
    	numero veintiuno = new numero(21);
    	numero uno = new numero(1);
    	numero cinco = new numero(5);
    	numero once = new numero(11);
    	listaNumeros.insertar(diez);
    	listaNumeros.insertar(veintiuno);
    //	listaNumeros.insertar(uno);
    	listaNumeros.insertar(cinco);
    	listaNumeros.insertar(once);
    	listaNumeros.mostrarLista();
    	 
    	 
    }
    
}
