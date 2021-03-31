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
public class Fecha {
    // tipo de dato / identificador 
    public int dia;
    public int mes;
    public int anio;
      
    
    // metodo constructor que se tiene que especificar dentro de las clases
    public Fecha(){
        // variable local
        // int x = 7;
        // inicializar los atributos del objeto
        this.dia = 10;
        this.mes = 7;
        this.anio = 1900;
    }
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    
    }
    // sobrecarga (establacer un metodo mas 1 de ocasión pero con diferentes parametros)
   
    
}
