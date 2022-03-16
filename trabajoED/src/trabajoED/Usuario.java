package trabajoED;

import java.util.Scanner;

public class Usuario {
	int DNI; 
	String nombre;
	String contraseña;
	int id_empleado;
	String departamento;
	boolean encargadoDepartamento;
	int eliminar;

Scanner sc = new Scanner(System.in);

public Usuario () {}

public Usuario (int dni1, String contra,int idEmpleado, String dep, boolean jefe )  {
	DNI =  dni1; 
	contraseña=contra;
	id_empleado= idEmpleado; 
	departamento = dep;
	encargadoDepartamento = jefe;
	
	
	
}


public void BuscarEmpleado () {
	
	System.out.println("Introduce el id del empleado para mostrarle sus datos");
	id_empleado = Integer.parseInt(sc.nextLine());
	System.out.println("DNI = 23345683B");
	System.out.println("NOMBRE = ALBERTO GARCIA PEREZ");
	System.out.println("DEPARTAMENTO = CONTABILIDAD");
	System.out.println("ENCARGADO DEL DEPARTAMENTO = NO");
	
	
	
	
}

public void ModificarUsuario () {
	System.out.println("El usuario ha sido modificado con exito");
}

public void EliminarUsuario () {
	System.out.println("¿Desea eliminar este usuario?");
	System.out.println("Pulse 1 para eliminar");
	System.out.println("Pulse 2 para salir del menu sin eliminar ningun usuario");
	eliminar = Integer.parseInt(sc.nextLine());
	if(eliminar==1) {
		System.out.println("El usuario ha sido eliminado con exito");
	} 
	if (eliminar==2) {
		System.out.println("Ha salido correctamente del menu");
	}
}
}