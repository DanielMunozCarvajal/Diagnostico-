
package com.mycompany.factura;


public class pagos  extends Factura{
    
    //atributo
    public double monto_total;
    public double iva= 1.13; 
    public double monto_neto;
    
    public void monto_total(double monto_total, double iva, double monto_neto){
        
        
        
        this.monto_total=monto_total;
        this.iva = iva;
        this.monto_neto= monto_neto;
        
    }
    
    
    
     public double get_monto_total(){
     return monto_total;   
    }
    public void set_monto_total(double monto_total){
        this.monto_total= monto_total;
    }
    
    public double get_iva(){
     return iva;   
    }
    public void set_iva(double iva){
        this.iva= iva;
    }
    
     public double get_monto_neto(){
     return monto_neto;   
    }
    public void set_monto_neto(double monto_neto){
        this.monto_neto= monto_neto;
    }   

    public double calculo_total(){
        monto_total= iva*monto_neto;
        System.out.println("El monto neto es: "+ monto_neto);
        System.out.println("valor agregado de iva:"+ 0.13* monto_neto );
        System.out.println("el monto con una aplicacion correspondiente del iva es: "+ monto_total);
        return monto_total;
    }
}
