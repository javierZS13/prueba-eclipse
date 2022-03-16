package trabajoED;

import java.util.Scanner;

public class DepartamentoObjetivo {
	int id_asignacion;
	int id_objetivo;
	String fechaAlta;
	String fechaBaja;
	String Observacion;
	int eliminar;
	
	Scanner sc = new Scanner(System.in);
	
	public DepartamentoObjetivo () {}
	
	public DepartamentoObjetivo (int idAsig, int idObj, String alta, String baja, String ob) { 
	 id_asignacion =idAsig; 
	 id_objetivo = idObj;
	 fechaAlta=  alta;
	 fechaBaja =baja;
	 Observacion= ob;
		
		
	}
	public void BuscarDepartamentoObjetivo () {
		
		System.out.println("Introduce el id de la asignacion para mostrarle los datos correspondientes");
		id_asignacion = Integer.parseInt(sc.nextLine());
		
		System.out.println("ID DEL OBJETIVO = 321");
		System.out.println("FECHA DEL ALTA = 02/04/2022");
		System.out.println("FECHA DE LA BAJA = 02/05/2022");
		System.out.println("OBSERVACION = CONSERVAR PLANTILLA INTEGRA PARA FUTUROS PROYECTOS");
		
		
		
		
		
	}

	public void ModificarDepartamentoObjetivo () {
		System.out.println("El objetivo del departamento ha sido modificado con exito");
	}

	public void EliminarDepartamentoObjetivo () {
		System.out.println("¿Desea eliminar este objetivo del departamento?");
		System.out.println("Pulse 1 para eliminar");
		System.out.println("Pulse 2 para salir del menu sin eliminar ningun usuario");
		eliminar = Integer.parseInt(sc.nextLine());
		if(eliminar==1) {
			System.out.println("El objetivo del departamento ha sido eliminado con exito");
		} 
		if (eliminar==2) {
			System.out.println("Ha salido correctamente del menu");
		}
	}

}
