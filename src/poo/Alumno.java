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
public class Alumno {
    
    public String nombre;
    public int edad;
    public String dom;
    public int semestre;

    // constructor por defecto
    public Alumno() {
        nombre = "";
        edad = 0;
        dom = "desconocido";
        semestre = 0;
    }

    public Alumno(String n, int edad, String dom, int semestre) {
        nombre = n;
        this.edad = edad;
        this.dom = dom;
        this.semestre = semestre;
    }
    
    
    
    
    
    
    
}
