/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ConversorMonedas_ONE.Operaciones;

/**
 *
 * @author Admin
 */
public class ConversorPeso {
    private double ValorKilos=0;
     private double ValorGramos=0;
private double ValorConversion=0;
     
     
      public double Conversion_Kilos_a_Gramos(){
     ValorConversion=ValorKilos*1000;
         
         return ValorConversion;
     }
      
     public double Conversion_Gramos_a_Kilos(){
         System.out.println(ValorGramos);
      ValorConversion=ValorGramos/1000;
         
         return ValorConversion;
     }

    public double getValorKilos() {
        return ValorKilos;
    }

    public void setValorKilos(double ValorKilos) {
        this.ValorKilos = ValorKilos;
    }

    public double getValorGramos() {
        return ValorGramos;
    }

    public void setValorGramos(double ValorGramos) {
        this.ValorGramos = ValorGramos;
    }

    public double getValorConversion() {
        return ValorConversion;
    }

    public void setValorConversion(double ValorConversion) {
        this.ValorConversion = ValorConversion;
    }

     
     
   
}
