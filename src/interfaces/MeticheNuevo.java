/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author working
 */
public class MeticheNuevo implements ActionListener {
    
    public MeticheNuevo() {
    
    }
    //  Interfaces en Java
    // el decir que una clase no está bien definida quiere decir que es abstracta
    @Override
    public void actionPerformed(ActionEvent e) {
        // CAST   Object ----> JMenuItem
        JMenuItem item = (JMenuItem)e.getSource();
        if (item.getText().equals("Nuevo")){
            System.out.println("Se oprimió el boton Nuevo");
        }
        if (item.getText().equals("Guardar")){
            System.out.println("Se oprimió el boton Guardar");
        }
        
        
    }

   
  
}
