import java.util.Scanner;
public class EntradaSaida { // inicio do algoritmo 
    public static void main(String[] args) { // Inicio do Programa Principal
        Scanner teclado = new Scanner(System.in);
        // declaracao das variaveis
        int idadeUsuario;
        String nomeUsuario;

        System.out.print("Meu primeiro programa.\n");
        System.out.print("Informe seu nome: ");
        nomeUsuario = teclado.next();
        System.out.print("Digite a sua idade: ");
        idadeUsuario = teclado.nextInt();
        System.out.print(nomeUsuario + " você tem " + idadeUsuario + " anos.\n");
    } // fim do Programa Principal    
} // fim do algoritmo 
