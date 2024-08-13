package controle;
import java.util.Scanner;
public class EatruturasControle {
    public static void main(String[] args) {
       
       Scanner teclado = new Scanner (System.in);
        String valor;
        
        System.out.println("======MENU=======");
        System.out.println("()default");
        System.out.println("(-5) Seleção Simples ");
        System.out.println("(-62)Laço for ");
        System.out.println("(78964) Seleção if-else");
        System.out.println("(81) Laço while");
        System.out.println("(47) Laço do-while");
        System.out.println("================");
        
        System.out.println("Digite um número");
        valor = teclado.next();
          switch (valor) {
              case "47":
                  System.out.println("47");
                  break;
              case "81":  
                   System.out.println("81");
                   break;
              case "-5":
                   System.out.println("-5");
                   break;
              default:
                 System.out.println("default");
                  
    }
    
}
}

