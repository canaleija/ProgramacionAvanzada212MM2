    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionavanzada212mm2;

import poo.Alumno;

/**
 *
 * @author working
 */
public class ProgramacionAvanzada212MM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       
//        int g = 23;
//        double h =1.5;
//        char n = 'v';
//        float t = 7;
//       
//        Fecha hoy = new Fecha(29, 7, 1987);
//        
//        Fecha ayer = new Fecha();
//        ayer.setDia(12);
//        ayer.setMes(11);
//        System.out.println(ayer.getDia());
        
        // ¿Herencia? Java
        // Objeto herede(atributos y comportamientos)a otro objeto
        // optimizar codigo(programar de mas)
        // clase padre que hereda a sus hijos ( tipos de herencias) Simple / multiple
        
        
       
//        System.out.println("Hola mundo");
       
        Alumno juan = new Alumno();// una instancia de un objeto de tipo Alumno
        juan.setSemestre(8);
        juan.setNombre("Juan Ramiro Maximiliano");
        juan.saluda();
        
        // sobre escritura de metodos y sobrecarga
        
        // que los objetos se comportan como se construyen
        System.out.println();
       
    }
    
}
