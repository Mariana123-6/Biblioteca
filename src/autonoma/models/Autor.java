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
public class Autor extends Persona{
    ////Atributos
    private String editorial;
    private String profesion;
    
    
    public Autor(String nombre, String documentoIdentidad, String correoElectronico, String editorial, String profesion) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
        
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
