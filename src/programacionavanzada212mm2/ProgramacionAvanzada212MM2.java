    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionavanzada212mm2;

import poo.Fecha;

/**
 *
 * @author working
 */
public class ProgramacionAvanzada212MM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // la clases me permiten crear nuevos tipos de datos
        // tipo de dato / identificador
        // la clase tambien me permite crear tipos de datos (estructura)
        // 29/03/2021 ¿variable?
        int g = 23;
        double h =1.5;
        char n = 'v';
        float t = 7;
        // crear un objeto y asignarlo a "hoy"
        // para poder crear objetos se tiene que ejecutar un metodo especial llamado 
        // "metodo constructor"
        // la palabra reservada new
        // instanciar un objeto / crear un objeto
        Fecha hoy = new Fecha(29, 7, 1987);
        
        Fecha ayer = new Fecha();
        ayer.setDia(12);
        ayer.setMes(11);
        System.out.println(ayer.getDia());
        // depuración de codigo
        /*
        Persona
                identificar atributos que describen a la persona
        Animal
        Alumno
        Profesor
        */
        System.out.println("Hola mundo");
       
        
        // 12 clases diferentes
        // 2 constructores (defecto/ mandan todo)
        // atributos privados con sus metodos de encapsulamiento
    }
    
}
