package trabajoED;

import java.util.Scanner;

public class Deducciones {
	int id_deduccion;
	int id_empleado;
	String fechaDeduccion;
	String tipoDeduccion;
	String detalle;
	int eliminar;
	Scanner sc = new Scanner (System.in);
	
	public void BuscarDeducciones () {
		
		System.out.println("Introduce el id de la deduccion para mostrarle sus datos");
		id_deduccion = Integer.parseInt(sc.nextLine());
		System.out.println("ID DEL EMPLEADO = 347");
		System.out.println("FECHA DEDUCCION = 23/04/2022");
		System.out.println("TIPO DE DEDUCCION = IRPF");
		System.out.println("DETALLE = NINGUNO");
		
		
		
		
	}

	public void ModificarDeducciones () {
		System.out.println("El usuario ha sido modificado con exito");
	}

	public void EliminarDeducciones () {
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


