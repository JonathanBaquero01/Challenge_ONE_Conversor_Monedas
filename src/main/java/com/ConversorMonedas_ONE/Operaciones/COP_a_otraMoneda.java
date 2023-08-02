/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ConversorMonedas_ONE.Operaciones;

/**
 *
 * @author Admin
 */
public class COP_a_otraMoneda {
    private int ValorCOP=0;
    private String Moneda_a_convertir="";
    private double Moneda_convertida=0;
    
     public COP_a_otraMoneda(int ValorCOP, String Moneda_a_convertir) {
        // Inicialización con los valores recibidos
        this.ValorCOP = ValorCOP;
        this.Moneda_a_convertir = Moneda_a_convertir;
        
        if ("Dólar".equals(Moneda_a_convertir)) {
Moneda_convertida=Conversion_COP_Dolar();
}
else if("Euros".equals(Moneda_a_convertir)){
   Moneda_convertida= Conversion_COP_Euros();
}
else if("Libras Esterlinas".equals(Moneda_a_convertir)){
 Moneda_convertida=Conversion_COP_Libras_Esterlinas();
}
else if("Yen Japonés".equals(Moneda_a_convertir)){
Moneda_convertida= Conversion_COP_Yen_Japonés();
}

else if("Won sul-coreano".equals(Moneda_a_convertir)){
 Moneda_convertida= Conversion_COP_Yen_Japonés();
}
        
    }
     
     public double Conversion_COP_Dolar(){
     Moneda_convertida= ValorCOP*0.00026;
         return Moneda_convertida;
     }
     
       public double Conversion_COP_Euros(){
     Moneda_convertida= ValorCOP*0.00023;
         return Moneda_convertida;
     }
       
        public double Conversion_COP_Libras_Esterlinas(){
     Moneda_convertida= ValorCOP*0.00020;
         return Moneda_convertida;
     }
        
          public double Conversion_COP_Yen_Japonés(){
     Moneda_convertida= ValorCOP*0.036;
         return Moneda_convertida;
     }
          
          public double Conversion_COP_Won_sul_coreano(){
     Moneda_convertida= ValorCOP*0.33;
         return Moneda_convertida;
     }

    public int getValorCOP() {
        return ValorCOP;
    }

    public void setValorCOP(int ValorCOP) {
        this.ValorCOP = ValorCOP;
    }

    public String getMoneda_a_convertir() {
        return Moneda_a_convertir;
    }

    public void setMoneda_a_convertir(String Moneda_a_convertir) {
        this.Moneda_a_convertir = Moneda_a_convertir;
    }

    public double getMoneda_convertida() {
        return Moneda_convertida;
    }

    public void setMoneda_convertida(double Moneda_convertida) {
        this.Moneda_convertida = Moneda_convertida;
    }
     
     
     
     
}
