package trabajoED;

import java.util.Scanner;

public class Departamento {
	int id_departamento;
	String nombre;
	String ciudad;
	String direccion;
	int telefono;
	String nombreEncargado;
	int eliminar;
	
	Scanner sc = new Scanner(System.in);
	
	public Departamento () {}
	
	public Departamento (int id, String nom, String ciu, String direc, int tfno, String nomEnc) {
		id_departamento= id;
		nombre = nom;
		ciudad = ciu;
		direccion = direc;
		telefono = tfno;
		nombreEncargado = nomEnc;
	}
	
	public void BuscarDepartamento () {
		System.out.println("Introduce el id del departamento para mostrarle sus datos");
		id_departamento = Integer.parseInt(sc.nextLine());
		System.out.println("NOMBRE = RECURSOS HUMANOS");
		System.out.println("CIUDAD = ZARAGOZA");
		System.out.println("DIRECCION = C/PLAZA DEL PILAR 6");
		System.out.println("TELEFONO = 976543375");
		System.out.println("ENCARGADO DEL DEPARTAMENTO = JOSE LUIS MONREAL ZABALETA");
	}
	public void ModificarDepartamento () {
		System.out.println("El departamento ha sido modificado con exito");
	}

	public void EliminarDepartamento () {
		System.out.println("¿Desea eliminar este departamento");
		System.out.println("Pulse 1 para eliminar");
		System.out.println("Pulse 2 para salir del menu sin eliminar ningun usuario");
		eliminar = Integer.parseInt(sc.nextLine());
		if(eliminar==1) {
			System.out.println("El departamento ha sido eliminado con exito");
		} 
		if (eliminar==2) {
			System.out.println("Ha salido correctamente del menu");
		}
	}

	}


