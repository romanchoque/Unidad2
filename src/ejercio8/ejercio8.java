package ejercio8;

import java.util.Scanner;

public class ejercio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int cantdeincrip = 0; 
        int edad;

        System.out.println("Ingrese el Nombre completo:");
        nombre = entrada.nextLine();

      
        while (nombre.trim().isEmpty()) {
            System.err.println("Error: El nombre no puede estar vacío.");
            System.out.print("Ingrese de nuevo el nombre: ");
            nombre = entrada.nextLine();
        }

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese cantidad de inscripciones:");
        cantdeincrip = entrada.nextInt();

    
        if (cantdeincrip < 5) {
            System.out.println("Aviso: La cantidad es menor a 5. Ingrese un nuevo valor:");
            cantdeincrip = entrada.nextInt();
        }

       
        System.out.println("\n--- Datos Registrados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad de inscripciones: " + cantdeincrip);
        
        entrada.close(); 
    }
}
