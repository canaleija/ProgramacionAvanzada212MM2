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
public class Alumno extends Persona {
    
   
    private int semestre;

    // constructor por defecto
    public Alumno() {
        super();
        semestre = 0;
    }

    public Alumno(String nombre, int edad, String dom, String sexo,int semestre) {
        super(nombre, edad, dom, sexo);
        this.semestre = semestre;       
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    
    
    
    
}
