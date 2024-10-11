/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.main;
import autonoma.models.Autor;
import autonoma.models.Libro;
import autonoma.views.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Biblioteca{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        // Crear autor
        //Autor autor1 = new Autor("Gabriel García Márquez", "12345678", "gabriel@correo.com", "Sudamericana", "Escritor");
        
        // Crear libros
        //Libro libro1 = new Libro(1, "Cien anos de soledad", autor1);
        //Libro libro2 = new Libro(2, "El amor en los tiempos del colera", autor1);
        //Libro libro3 = new Libro(3, "Cronica de una muerte anunciada", autor1);
        
        // Agregar libros a la biblioteca
       // biblioteca.agregarLibro(libro1);
        //biblioteca.agregarLibro(libro2);
        //biblioteca.agregarLibro(libro3);
        
        // Mostrar los libros
        //System.out.println(biblioteca.mostrarLibros());
        
        // Ordenar libros alfabéticamente
        //ArrayList<Libro> librosOrdenados = biblioteca.obtenerLibrosAlfabeticamente();
        //for (Libro libro : librosOrdenados) {
           // System.out.println(libro.getTitulo());
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        }
    }

