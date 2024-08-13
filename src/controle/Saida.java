package controle;
import java.util.Scanner;
public class Saida {
    public static void main (String SegundaDivisãoTimao[]) // ou pode ser public static void main(String[] args){}
    { 
        int idade;
        String valor;
        int numero;
        Scanner teclado = new Scanner(System.in);
        valor = teclado.next();
   switch (valor)  {   
case "6":

                    System.out.println("\n Você escolheu o vetor \n"+
                                       "-----------------------");
                    
                    int cpfErrorLevel;
                    int cpfVerificador;
                    int[] cpfVetor;
                    
                    do {

                        String cpfString = "0";

                        do {

                            cpfErrorLevel = 0;
                            System.out.print("Digite o CPF (sem pontos e traço): ");
                            cpfString = teclado.next();
                            cpfString = cpfString.replaceAll("[^\\d]", "");
                           
                            // Coloca cada número da variável string no vetor
                            cpfVetor = new int[12];
                            for (int i = 0; i < 11; i++) {
                               cpfVetor[i] = cpfString.charAt(i) - '0';
                               System.out.println(cpfVetor[i]);
                            }
                            cpfVerificador = cpfVetor[1];
                            
                            // Verifica se o cpf contém outros caracteres além de números
                            if (!cpfString.matches("[0-9]+")) {
                               System.out.println(" #! Por favor, digite apenas números.\n");
                               cpfErrorLevel++;
                            }
                            
                            //System.out.println("Errorlevel: " + cpfErrorLevel);
                             
                            // Verifica se o cpf é um sequência de números iguais
                            int a = 0;
                            for (int i = 0; i < 11; i++) {
                               if (cpfVetor[i] == cpfVerificador) {
                                    a++;
                                    //System.out.println("Somando: " + a);
                               }
                            }
                            if (a >= 11) {
                               cpfErrorLevel++;
                               System.out.println(" #! Por favor, não digite números repitidos.\n");
                            }
                            
                            //System.out.println("Errorlevel: " + cpfErrorLevel);
                             
                        } while (cpfErrorLevel != 0);
                        
                        // Calcula o X (primeiro dígito do CPF)
                        int soma = 0;
                        for (int i = 0; i < 9; i++) {
                            soma += cpfVetor[i] * (10 - i);
                        }
                        int digito1 = 11 - (soma % 11);
                        if (digito1 > 9) {
                            digito1 = 0;
                        }
                        soma = 0;
                        for (int i = 0; i < 10; i++) {
                            soma += cpfVetor[i] * (11 - i);
                        }
                        int digito2 = 11 - (soma % 11);
                        if (digito2 > 9) {
                            digito2 = 0;
                        }
                        
                        if (digito1 == cpfVetor[9] && digito2 == cpfVetor[10]) {
                            System.out.println(" \n#! Ótimo! O CPF " + cpfString + " é valido!");
                        } else {
                            cpfErrorLevel++;
                            System.out.println(" #! Erro! O CPF " + cpfString + " não é válido!\n");
                        }
                        
                        //System.out.println("Errorlevel: " + cpfErrorLevel);
                        
                    } while (cpfErrorLevel != 0);
            
   }
        }
        
    }

