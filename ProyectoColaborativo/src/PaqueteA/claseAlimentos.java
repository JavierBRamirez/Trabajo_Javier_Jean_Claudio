/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteA;

/**
 *
 * @author XPC
 */

import java.util.Date;

public class claseAlimentos {

    private String nombre;
    private String color;
    private Date fechaExpo; 
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the fechaExpo
     */
    public Date getFechaExpo() {
        return fechaExpo;
    }
    
    /**
     * @param fechaExpo the fechaExpo to set
     */
    public void setFechaExpo(Date fechaExpo) {
        this.fechaExpo = fechaExpo;
    }
    
    public claseAlimentos(String nombre, String color, Date fechaExpo) {
        this.nombre = nombre;
        this.color = color;
        this.fechaExpo = fechaExpo;
    }

    
    
  
}
