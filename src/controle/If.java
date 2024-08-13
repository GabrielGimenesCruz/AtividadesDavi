
package controle;
import java.util.Scanner;
public class If {
    public static void main (String SegundaDivisãoTimao[])
    {
     int numero;
     Scanner teclado = new Scanner (System.in);        
     
     numero = teclado.nextInt();
      System.out.print("\n Valor digitado:" + numero + "\n");
        System.out.println("");
        if ((numero<= -10 && numero>0) || (numero>0 && 10>=numero)) {
            System.out.println("seu resultado está na lista");
        } else System.out.println("Não há na lista"); 
    
    
    
    
    
    }
}
