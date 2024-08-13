 import java.util.Scanner;
 public class Retorno{
 public static void main(String[] args){

Scanner teclado = new Scanner (System.in);
        int operacao, resultado;
        gerarTelaCalculadora();
        operacao = teclado.nextInt();
        switch (operacao){
            case 0:
                System.exit(0);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                resultado = subtrairNumeros();
                 System.out.println("A subtração dos numeros é: " + resultado);
                break;
            case 4:
                break;
            default:
            
        } //fim main
    
 } 
     // PROCEDIMENTO SEM PASSAGEM DE PARAMETROS (void)
      static void gerarTelaCalculadora(){
         System.out.println("cauculadora simples");
         System.out.println("(1) adicao");
         System.out.println("(2) multiplicacao");
         System.out.println("(3) subtracao");
         System.out.println("(4) divisao");
         System.out.println("(0) sair");
         System.out.println("escolha uma operacao:");
     } // fim gerarTelaCalculadora
 
      
      // FUNCAO SEM PASSAGEM DE PARAMETROS
     static int subtrairNumeros(){
      int a, b;
      Scanner digitacao = new Scanner(System.in);
      System.out.println("Informe o 1° numero");
      a = digitacao.nextInt();
      System.out.println("Informe o 2° numero");
      b = digitacao.nextInt();
      return a - b;
     }
     
     // PROCEDIMENTO COM PASSAGEM DE PARAMETROS
     //AdicionarNumero
     
     
     // FUNCAO COM PASSAGEM DE PARAMETROS
     //DividirNumeros
     
     //MultiplicarNumeros
}