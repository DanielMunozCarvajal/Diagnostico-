
package com.mycompany.factura;
import java.util.Scanner;


public class Factura {

    public static void main(String[] args) {
        
        Herencia nombre= new Herencia();
        pagos agua= new pagos();
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("dijite el nombre del cliente");
        nombre.set_nombre (sc.nextLine());
        System.out.println("dijite el monto del producto a comprar");
        agua.set_monto_neto(sc.nextDouble());
        nombre.set_nombre(nombre.dijitar());
        nombre.get_nombre();
        agua.set_monto_total(agua.calculo_total());
        agua.get_monto_total();
        
        
        
      
        
      
    }
    
    
}
