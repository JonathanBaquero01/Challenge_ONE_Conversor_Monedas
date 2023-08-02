/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ConversorMonedas_ONE.Vista;

import FrontEnd.PlaceHolder;
import com.ConversorMonedas_ONE.Operaciones.COP_a_otraMoneda;
import com.ConversorMonedas_ONE.Operaciones.OtraMoneda_a_COP;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Menu_ConversorMonedas extends javax.swing.JFrame {

    /**
     * Creates new form Menu_ConversorMonedas
     */
    public Menu_ConversorMonedas() {
        initComponents();
        this.setLocationRelativeTo(this);//para q se ponga en el centro
        ImageIcon imagen = new ImageIcon("Imagenes/Raya.png");

        // Establecer la imagen como el icono del JLabel
        jLabel3.setIcon(imagen);

        Ajustamiento_Objetos();
    }

    public void Ajustamiento_Objetos() {
        //le digo q donde posicione lo q se escriba
        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
        jTextField2.setHorizontalAlignment(jTextField2.CENTER);

        //aqui le asigon lo q se vera en el text q se borra al escribir
        PlaceHolder placeholder = new PlaceHolder("Ingrese el valor COP a convertir", jTextField1, PlaceHolder.Show.ALWAYS, jTextField1.CENTER);
        placeholder = new PlaceHolder("Ingrese el valor a convertir", jTextField2, PlaceHolder.Show.ALWAYS, jTextField2.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("Convertir COP a otra moneda ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Convertir otra moneda a COP");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Seleccione:");

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP a Dólar", "COP a Euros", "COP a Libras Esterlinas", "COP a Yen Japonés", "COP a Won sul-coreano" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar a COP ", "Euros a COP", "Libras Esterlinas a COP", "Yen Japonés a COP", "Won sul-coreano a COP" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("OK");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Volver");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(102, 102, 102))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Moneda_a_convertir_seleccionada = jComboBox1.getSelectedItem() != null ? jComboBox1.getSelectedItem().toString() : "";
        String Moneda_a_convertir = "";
        if (Moneda_a_convertir_seleccionada.contains("Dólar")) {
            Moneda_a_convertir = "Dólar";
        } else if (Moneda_a_convertir_seleccionada.contains("Euros")) {
            Moneda_a_convertir = "Euros";
        } else if (Moneda_a_convertir_seleccionada.contains("Libras Esterlinas")) {
            Moneda_a_convertir = "Libras Esterlinas";
        } else if (Moneda_a_convertir_seleccionada.contains("Yen Japonés")) {
            Moneda_a_convertir = "Yen Japonés";
        } else if (Moneda_a_convertir_seleccionada.contains("Won sul-coreano")) {
            Moneda_a_convertir = "Won sul-coreano";
        }

        COP_a_otraMoneda cOP_a_otramoneda = new COP_a_otraMoneda(Integer.parseInt(jTextField1.getText()), Moneda_a_convertir);

        JOptionPane.showMessageDialog(null, String.valueOf(cOP_a_otramoneda.getMoneda_convertida()));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String Moneda_a_convertir_a_COP_seleccionada = jComboBox2.getSelectedItem() != null ? jComboBox2.getSelectedItem().toString() : "";
String Moneda_a_convertir_a_COP = "";

OtraMoneda_a_COP otramoneda_a_COP = new OtraMoneda_a_COP(Double.parseDouble(jTextField2.getText()));

if (Moneda_a_convertir_a_COP_seleccionada.contains("Dólar")) {
    Moneda_a_convertir_a_COP = "Dólar";
    JOptionPane.showMessageDialog(null, String.valueOf(otramoneda_a_COP.Conversion_Dolar_a_COP()));
} else if (Moneda_a_convertir_a_COP_seleccionada.contains("Euros")) {
    Moneda_a_convertir_a_COP = "Euros";
     JOptionPane.showMessageDialog(null, String.valueOf(otramoneda_a_COP.Conversion_Euros_a_COP()));
} else if (Moneda_a_convertir_a_COP_seleccionada.contains("Libras Esterlinas")) {
    Moneda_a_convertir_a_COP = "Libras Esterlinas";
         JOptionPane.showMessageDialog(null, String.valueOf(otramoneda_a_COP.Conversion_Libras_Esterlinas_a_COP()));
} else if (Moneda_a_convertir_a_COP_seleccionada.contains("Yen Japonés")) {
    Moneda_a_convertir_a_COP = "Yen Japonés";
     JOptionPane.showMessageDialog(null, String.valueOf(otramoneda_a_COP.Conversion_Yen_Japonés_a_COP()));
} else if (Moneda_a_convertir_a_COP_seleccionada.contains("Won sul-coreano")) {
    Moneda_a_convertir_a_COP = "Won sul-coreano";
         JOptionPane.showMessageDialog(null, String.valueOf(otramoneda_a_COP.Conversion_Won_sul_coreano_a_COP()));
}



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   Menu menu = new Menu();
   menu.setVisible(true);
   this.dispose();
   
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_ConversorMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
