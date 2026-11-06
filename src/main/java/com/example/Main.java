package com.example;

/**
 * Clase principal ejecutable para demostrar la instanciación de objetos,
 * el uso de constructores sobrecargados y las validaciones de encapsulamiento.
 */
public class Main {
    public static void main(String[] args) {

        // 1. Creando objetos de Autor con diferentes constructores
        Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiana", 1927);
        Autor autor2 = new Autor("A02", "Mario Vargas Llosa");
        Autor autor3 = new Autor();
        autor3.setIdAutor("A03");
        autor3.setNombre("Isabel Allende");
        autor3.setNacionalidad("Chilena");
        autor3.setAnioNacimiento(1942);

        System.out.println("--- AUTORES ---");
        System.out.println(autor1.toString());
        System.out.println(autor2.toString());
        System.out.println(autor3.toString());

        // 2. Creando objetos de Libro con diferentes constructores
        Libro libro1 = new Libro("ISBN-001", "Cien años de soledad", autor1, 1967, 45000, 10);
        Libro libro2 = new Libro("ISBN-002", "La ciudad y los perros", autor2); // Sobrecargado sin precio ni stock
        Libro libro3 = new Libro("ISBN-003", "La casa de los espíritus", autor3, 1982);

        // Probando validaciones en setters
        libro2.setPrecio(-5000); // Mostrará el mensaje de error por ser negativo
        libro2.setPrecio(38000); // Asignará el precio correcto
        libro2.setStock(5);

        System.out.println("\n--- LIBROS ---");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());

        // 3. Creando objetos de Usuario con diferentes constructores
        Usuario usuario1 = new Usuario("U01", "Juan De Los Rios", "juan@correo.com", 2);
        Usuario usuario2 = new Usuario("U02", "Ricardo", "ricardo@correo.com");
        Usuario usuario3 = new Usuario("U03", "Carlos");

        System.out.println("\n--- USUARIOS ---");
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(usuario3.toString());
    }
}