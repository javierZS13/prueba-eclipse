package examen0361jzarzuela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaExamen {
	static String nombre1;
	static String nombre2;
	static String nombreCompuesto;
	static String apellido;
	static String DNI;
	static String mail;
	static Boolean salir = false;
	static int opcion;
	
	
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		while (!salir) {
			System.out.println("1.Introducir datos");
			System.out.println("2.Mostrar datos");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {

			case 1:
				System.out.println("Introduce el nombre1: ");
				nombre1 = sc.nextLine();
				System.out.println("Introduce el nombre2: ");
				nombre2 = sc.nextLine();
				System.out.println("Introduce el apellido: ");
				apellido = sc.nextLine();
				System.out.println("Introduce el DNI: ");
				DNI= sc.nextLine();
				System.out.println("Introduce el mail: ");
				mail = sc.nextLine();
				nombreCompuesto= nombre1 + nombre2;
				break;
				
			case 2:
				System.out.println(nombre1 + apellido);
				System.out.println(nombreCompuesto.length);
				
				
				
				

	}
		}
	}
	
	
	
	public static String valueOf(String cadena) {
		cadena = "12345678D";
		cadena= String.valueOf(false);
		boolean resultado;
		char[]caracter  = cadena.toCharArray(); 
		//caracter= caracter%23;
		
		
		return cadena;
	}
	
	
	public void cuentaVocales (String vocales) {
		vocales = "abcd";
		char[]caracter  = vocales.toCharArray(); 
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for(int x=0; x<vocales.length(); x++) {
			switch (caracter[x]){
			case 'a': 
				a= a+1;
				
			
			break;
			case 'e': e = e+1;
			break;
			case 'i': i= i+1;
			break;
			case 'o': o= o+1;
			break;
			case 'u': u= u+1;
			break;
			
					
		}
		}
		
	}
	
	
	public void cuentaPalabras (String cadena) {
		cadena = "palabra";
		char[]caracter  = cadena.toCharArray();
		for(int i=0; i<cadena.length(); i++) {
			System.out.println(caracter.length);
			
		}
	}
	
	public void imprimeVertical () {
		
	}
	public void distCuatro () {
		
	String  array [] = new String [4];
	List <String> lista = new ArrayList<String>();
	lista.add(array);
	for (String j: lista) {
		System.out.println(j);
	}
	}

}
