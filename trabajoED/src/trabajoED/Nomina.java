package trabajoED;

import java.util.Scanner;

public class Nomina {
	int id_nomina;
	String fechaAlta;
	String fechaBaja;
	Double total;
	int eliminar;
	
	
	Scanner sc = new Scanner(System.in);

	public Nomina () {}

	public Nomina (int idN, String alta,String baja, Double tot )  {
		 id_nomina = idN;
		 fechaAlta = alta;
		 fechaBaja = baja;
		 total = tot;
		
		
		
	}


	public void BuscarNomina () {
		
		System.out.println("Introduce el id de la nomina para mostrarle sus datos");
		id_nomina = Integer.parseInt(sc.nextLine());
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
