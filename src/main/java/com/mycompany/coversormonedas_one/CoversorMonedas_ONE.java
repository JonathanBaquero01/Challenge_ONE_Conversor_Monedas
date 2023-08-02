/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coversormonedas_one;

import com.ConversorMonedas_ONE.Vista.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Admin
 */
public class CoversorMonedas_ONE {

    public static void main(String[] args) {
           try {//esto es para que el diseño de la app sea como el del sistema operativo
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CoversorMonedas_ONE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           Menu menu = new Menu();
           menu.setVisible(true);
    }
}
