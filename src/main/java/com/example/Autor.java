package com.example;

public class Autor {

    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    /**
     * 1. Constructor vacío por defecto.
     */
    public Autor() {
    }

    /**
     * 2. Constructor parametrizado con todos los atributos.
     */
    public Autor(String idAutor, String nombre, String nacionalidad, int anioNacimiento) {
        setIdAutor(idAutor);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setAnioNacimiento(anioNacimiento);
    }

    /**
     * 3. Constructor sobrecargado 1 (Solo ID y nombre).
     */
    public Autor(String idAutor, String nombre) {
        setIdAutor(idAutor);
        setNombre(nombre);
    }

    /**
     * 4. Constructor sobrecargado 2 (Sin año de nacimiento).
     */
    public Autor(String idAutor, String nombre, String nacionalidad) {
        setIdAutor(idAutor);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }

    // Getters y Setters
    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        if (idAutor != null && !idAutor.isEmpty()) {
            this.idAutor = idAutor;
        } else {
            System.out.println("Error: El ID del autor no puede estar vacío.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad != null && !nacionalidad.isEmpty()) {
            this.nacionalidad = nacionalidad;
        } else {
            System.out.println("Error: La nacionalidad no puede estar vacía.");
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > 1000 && anioNacimiento <= 2026) {
            this.anioNacimiento = anioNacimiento;
        } else {
            System.out.println("Error: Año de nacimiento incoherente.");
        }
    }

    /**
     * Retorna la representación en cadena de los datos del autor.
     */
    @Override
    public String toString() {
        return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", anioNacimiento=" + anioNacimiento + "]";
    }
}