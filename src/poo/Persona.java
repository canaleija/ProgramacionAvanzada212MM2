/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author working
 */
public class Persona  {
         
    private String nombre;
    private int edad;
    private String dom;
    private String sexo;
    // peso

    public Persona() {
        this.nombre ="";
        this.edad = 0;
        this.dom ="desconocido";
        this.sexo = "";
    }

    public Persona(String nombre, int edad, String dom, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dom = dom;
        this.sexo = sexo;
    }

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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the dom
     */
    public String getDom() {
        return dom;
    }

    /**
     * @param dom the dom to set
     */
    public void setDom(String dom) {
        this.dom = dom;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
}
