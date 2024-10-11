/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método 
    public String mostrarLibros() {
        String resultado = "";
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca.";
        }
        
        for (Libro libro : libros) {
            resultado += "ID: " + libro.getId() + ", Título: " + libro.getTitulo() +
                         ", Autor: " + libro.getAutor().getNombre() + "\n";
        }
        return resultado;
    }

    // Método para agregar un libro a la biblioteca
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // Método para buscar un libro por su ID
    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    // Método para actualizar un libro existente
    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        Libro libroExistente = buscarLibro(id);
        if (libroExistente != null) {
            libroExistente.setTitulo(nuevoLibro.getTitulo());
            libroExistente.setAutor(nuevoLibro.getAutor());
            return true;
        }
        return false;
    }

    // Método para eliminar un libro de la biblioteca
    public boolean eliminarLibro(long id) {
        Libro libro = buscarLibro(id);
        if (libro != null) {
            return libros.remove(libro);
        }
        return false;
    }

    // Método para obtener una lista de libros ordenados alfabéticamente por título
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);

        // Ordenar manualmente utilizando un algoritmo simple como la burbuja
        for (int i = 0; i < librosOrdenados.size() - 1; i++) {
            for (int j = 0; j < librosOrdenados.size() - i - 1; j++) {
                if (librosOrdenados.get(j).getTitulo().compareTo(librosOrdenados.get(j + 1).getTitulo()) > 0) {
                    Libro temp = librosOrdenados.get(j);
                    librosOrdenados.set(j, librosOrdenados.get(j + 1));
                    librosOrdenados.set(j + 1, temp);
                }
            }
        }
        return librosOrdenados;
    }
}
