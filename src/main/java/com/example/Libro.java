package com.example;


public class Libro {

    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    /**
     * 1. Constructor vacío por defecto.
     */
    public Libro() {
    }

    /**
     * 2. Constructor parametrizado con todos los atributos.
     */
    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio, int stock) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
        setPrecio(precio);
        setStock(stock);
    }

    /**
     * 3. Constructor sobrecargado 1 (Pedido en la guía: solo ISBN, título y autor).
     */
    public Libro(String isbn, String titulo, Autor autor) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
    }

    /**
     * 4. Constructor sobrecargado 2 (Sin precio ni stock, pero con año).
     */
    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
    }

    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Error: El ISBN no puede estar vacío.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: El título no puede estar vacío.");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor != null) {
            this.autor = autor;
        } else {
            System.out.println("Error: El autor no puede ser nulo.");
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1400 && anioPublicacion <= 2026) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: Año de publicación incoherente.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    /**
     * Retorna la representación en cadena de los datos del libro.
     */
    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", precio=" + precio + ", stock=" + stock + "]";
    }
}