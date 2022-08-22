
package com.mycompany.factura;



public class morbosidad extends Factura {
    
      public String nombre= " ";
      
      public void nombre(String nombre){
          
          this.nombre= nombre;
          
          
         
          
          
      }
      
      public String get_nombre(){
        
          return nombre;
          
      }
      
      public void  set_nombre( String nombre){
          
          this.nombre =nombre;
         
    
      }
      
    public String dijitar(){
        
         System.out.println(" nombre del cliente:"+ nombre);
         return nombre;
         
    }  
    
    }



