
package boletin2.pkg6;

import java.util.Scanner;


public class Boletin26 {

  
     
    public static void main(String[] args) {
        float prezotarifa, prezopagado;
        System.out.print(" Prezo da tarifa");
        Scanner dato= new Scanner (System.in);
         prezotarifa= dato.nextFloat();
         System.out.print(" Prezo pagado");
        Scanner datoo= new Scanner (System.in);
         prezopagado= dato.nextFloat();
         
         System.out.println("O porcentaxe de desconto entre o prezo de tarifa e pagado é"+(prezotarifa+prezopagado)/prezotarifa*100 +"%30");
       
    }
    
}
