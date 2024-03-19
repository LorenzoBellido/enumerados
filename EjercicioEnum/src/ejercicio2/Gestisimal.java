package ejercicio2;

import java.util.Scanner;

import ejercicio2.Articulo.Departamento;

public class Gestisimal {
	static Scanner sc = new Scanner(System.in);

	public static Articulo[] articulos = new Articulo[20];

	public static void listado() {
		int i = 0;
		while (i < articulos.length && articulos[i] != null) {
			System.out.println(articulos[i]);
			i++;
		}
	}

	public static int busqueda(Articulo art) {
		int pos = -1;
		int i = 0;
		while (i < articulos.length && pos == -1) {
			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}
			i++;
		}

		return pos;
	}

	public static boolean alta(Articulo art) {
		boolean anyadido = false;

		int pos = busqueda(art);
		int i = 0;

		if (pos == -1) {
			while (i < articulos.length && articulos[i] != null) {
				i++;
			}
			if (i < articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}
		}

		return anyadido;
	}

	public static boolean baja(Articulo art) {
		boolean eliminado = false;
		int i = 0;
		while (!articulos[i].equals(art) && !eliminado) {
			i++;
		}
		if (i < articulos.length) {
			articulos[i] = null;
			eliminado = true;
		}

		return eliminado;
	}

	public static boolean modificacion(int codigo, int opc) {
		boolean modificado = true;
		int opcion = opc;
		int i = 0;
		String descripcion = "";
		String departamento = "";
		double precioVenta = 0;
		double precioCompra = 0;

		while(i < articulos.length && articulos[i] != null && codigo != articulos[i].getCodigo()) {
		i++;
		}
		if(articulos[i] == null) {
			i = articulos.length;
			modificado = false;
		}
			if(i < articulos.length && codigo == articulos[i].getCodigo()) {
			switch (opcion) {
			case 1 -> {
				descripcion = sc.nextLine();
				articulos[i].setDescripcion(descripcion);
			}
			case 2 -> {
				precioCompra = sc.nextDouble();
				articulos[i].setPrecioCompra(precioCompra);
				sc.nextLine();
			}
			case 3 -> {
				precioVenta = sc.nextDouble();
				articulos[i].setPrecioVenta(precioVenta);
				sc.nextLine();
			}
			case 4 -> {
				departamento = sc.next();
				sc.nextLine();
				articulos[i].setDepartamento(departamento);
			}

			default -> {
				System.out.println("Dato no comprendido");
			}
			}
			
		}else {
			modificado = false;
		}
		
		return modificado;
	}
	
	public static boolean entradaMercancia(int codigo, int cantidad) {
		boolean entrada = false;
		int i = 0;
		int nuevoStock;
		
		if(articulos[i] == null) {
			i = articulos.length;
		}
		while(i < articulos.length && articulos[i] != null && codigo != articulos[i].getCodigo()) {
			i++;
			}
				if(i < articulos.length && codigo == articulos[i].getCodigo()) {
					nuevoStock = articulos[i].getStock() + cantidad;
					articulos[i].setStock(nuevoStock);
					entrada = true;
				}
		
				
		return entrada;
	}
	
	public static boolean salidaMercancia(int codigo, int cantidad) {
		boolean salida = false;
		int i = 0;
		int nuevoStock;
		
		if(articulos[i] == null) {
			i = articulos.length;
		}
		while(i < articulos.length && articulos[i] != null && codigo != articulos[i].getCodigo()) {
			i++;
			}
				if(i < articulos.length && codigo == articulos[i].getCodigo()) {
					nuevoStock = articulos[i].getStock();
					if(nuevoStock >= cantidad) {
						nuevoStock -= cantidad;
						articulos[i].setStock(nuevoStock);
						salida = true;
					}
				}
		
				
		return salida;
	}
}
