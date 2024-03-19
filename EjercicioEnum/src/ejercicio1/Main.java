package ejercicio1;

import java.util.Scanner;

import ejercicio1.Libro;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String genero = "";
		
		
		System.out.println("Introduce el género del libro 1");
		genero = sc.next();
		Libro lib1 = new Libro("La vida en la campana II", "Hector",1, 0, genero);
		System.out.println("Introduce el género del libro 2");
		genero = sc.next();
		Libro lib2 = new Libro("La vida en la campana", "Hector", 3, 0, genero);
		lib1.prestamo();
		lib2.devuelve();

		System.out.println(lib1);
		System.out.println(lib2);
	}

}
