package ejercio8;

import java.util.Scanner;

public class ejercio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int  cantdeincrip;
		int edad ;

		System.out.println("Ingrese el Nombre completo  ");
		nombre = entrada.nextLine();
		System.out.println("ingrese su edad");
		edad = entrada.nextInt();
		
		while (nombre.isBlank()) {

			System.err.println("Error: El no puede aver espacio. Inténtelo de nuevo:");
			System.out.print("iNGRESELO DE NUEVO EL NOMBRE: ");
			nombre = entrada.nextLine();
		}

		System.out.println("Mostrar cantidad de inscripciones"+cantdeincrip+);
		
		

		// Validación de rango: La edad debe ser coherente (entre 0 y 130 años)
		if (cantdeincrip < 5) {
			System.err.print("Error: ingrese de nuevo  el  nombre .:");
			cantdeincrip = entrada.nextInt();
		}

		// --- Salida de datos finales ---
		System.out.println("--- Datos ---");
		
		System.out.println("Nombre y la edad: " +nombre);
		System.out.println("Su edad es: " + edad );
		System.out.println("Cantidad de inscripciones: " + cantdeincrip);

	}

}
