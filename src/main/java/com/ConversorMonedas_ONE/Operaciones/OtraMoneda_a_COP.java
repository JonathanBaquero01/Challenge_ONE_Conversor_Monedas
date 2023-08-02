/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ConversorMonedas_ONE.Operaciones;

/**
 *
 * @author Admin
 */
public class OtraMoneda_a_COP {
    private double Valor_OtraMoneda=0;
    private double Moneda_convertida_a_COP=0;
    
      public OtraMoneda_a_COP(double Valor_OtraMoneda) {
 this.Valor_OtraMoneda = Valor_OtraMoneda;
      }
      
      public double Conversion_Dolar_a_COP(){
          Moneda_convertida_a_COP= Valor_OtraMoneda*4000;
          
      return Moneda_convertida_a_COP;
      }
      
      public double Conversion_Euros_a_COP(){
          Moneda_convertida_a_COP= Valor_OtraMoneda*4400;
          
      return Moneda_convertida_a_COP;
      }
      
         public double Conversion_Libras_Esterlinas_a_COP(){
          Moneda_convertida_a_COP= Valor_OtraMoneda*5100;
          
      return Moneda_convertida_a_COP;
      }
         
         public double Conversion_Yen_Japonés_a_COP(){
          Moneda_convertida_a_COP= Valor_OtraMoneda*28; 
          
      return Moneda_convertida_a_COP;
      }
         
          public double Conversion_Won_sul_coreano_a_COP(){
          Moneda_convertida_a_COP= Valor_OtraMoneda*3; 
          
      return Moneda_convertida_a_COP;
      }

         
         
    public double getValor_OtraMoneda() {
        return Valor_OtraMoneda;
    }

    public void setValor_OtraMoneda(double Valor_OtraMoneda) {
        this.Valor_OtraMoneda = Valor_OtraMoneda;
    }

    public double getMoneda_convertida_a_COP() {
        return Moneda_convertida_a_COP;
    }

    public void setMoneda_convertida_a_COP(double Moneda_convertida_a_COP) {
        this.Moneda_convertida_a_COP = Moneda_convertida_a_COP;
    }

 
    
    
    
    
    
    
    
    
}
