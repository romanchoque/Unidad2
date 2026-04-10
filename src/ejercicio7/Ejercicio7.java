package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String producto;
		int cantstock;

		System.out.println("Ingrese el Nombre del Producto");
		producto = entrada.nextLine();
		while (producto.isBlank()) {

			System.err.println("Error: El stock no puede aver espacio. Inténtelo de nuevo:");
			System.out.print("iNGRESELO DE NUEVO: ");
			producto = entrada.nextLine();
		}

		System.out.println("Ingrese la cantidad de stock del producto");
		cantstock = entrada.nextInt();

		// Validación de rango: La edad debe ser coherente (entre 0 y 130 años)
		if (cantstock < 5) {
			System.err.print("Error:  de stock no válida. Ingrese un valor entre 5 y 100:");
			cantstock = entrada.nextInt();
		}

		// --- Salida de datos finales ---
		System.out.println("--- Datos ---");
		System.out.println("producto: " + producto);
		System.out.println("cantstock: " + cantstock);

	}

}
