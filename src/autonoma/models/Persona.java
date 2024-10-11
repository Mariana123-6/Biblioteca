/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;

/**
 * Una persona es una sumatoria de características comunicables: 
 * una personalidad, un ánimo, una forma de actuar y de sentir
 *
 * @author mariana salgado lopez 
 * @since 12092024
 * @version 1.0.0
 */
public abstract class Persona {
    ////atributos
    protected String nombre;
    protected String documentoIdentidad;
    protected String correoEletronico;
    
    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoEletronico = correoEletronico;
    }
    
    ////metodo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoEletronico() {
        return correoEletronico;
    }

    public void setCorreoEletronico(String correoEletronico) {
        this.correoEletronico = correoEletronico;
    }
    
    
}
