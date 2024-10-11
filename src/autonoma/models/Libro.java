/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;


/**
 *  persona que concibe en su mente la creación y que luego la plasma o expresa en una obra
 *
 * @author mariana salgado lopez 
 * @since 12092024
 * @version 1.0.0
 */
public class Libro {
    ///atributos
    private long id;
    private String titulo;
    private Autor autor;
    
    ///CONSCTRUCTOR

    public Libro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    
    ///METODOS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
}
