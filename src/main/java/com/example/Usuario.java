package com.example;

public class Usuario {

    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    /**
     * 1. Constructor vacío por defecto.
     */
    public Usuario() {
    }

    /**
     * 2. Constructor parametrizado con todos los atributos.
     */
    public Usuario(String idUsuario, String nombre, String correoElectronico, int librosPrestados) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        setLibrosPrestados(librosPrestados);
    }

    /**
     * 3. Constructor sobrecargado 1 (Sin librosPrestados, inicia en 0).
     */
    public Usuario(String idUsuario, String nombre, String correoElectronico) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        this.librosPrestados = 0;
    }

    /**
     * 4. Constructor sobrecargado 2 (Solo ID y nombre).
     */
    public Usuario(String idUsuario, String nombre) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
    }

    // Getters y Setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        if (idUsuario != null && !idUsuario.isEmpty()) {
            this.idUsuario = idUsuario;
        } else {
            System.out.println("Error: El ID de usuario no puede estar vacío.");
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && !correoElectronico.isEmpty()) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("Error: El correo electrónico no puede estar vacío.");
        }
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        if (librosPrestados >= 0) {
            this.librosPrestados = librosPrestados;
        } else {
            System.out.println("Error: Los libros prestados no pueden ser negativos.");
        }
    }

    /**
     * Retorna la representación en cadena de los datos del usuario.
     */
    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", librosPrestados=" + librosPrestados + "]";
    }
}