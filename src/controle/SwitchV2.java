package controle;

import java.util.Scanner;

public class SwitchV2 {

    public static void main(String[] args) {
        String z;
        int y = 1;
        Scanner teclado = new Scanner(System.in);
        String valor;

        do {
gabriel();
            valor = teclado.next();

            switch (valor) {
                case "1":
                    System.out.println("Validação de CPF");
                    int cpfErrorLevel;
                    int cpfVerificador;
                    int[] cpfVetor;
                    
                    do {

                        String cpfString = "0";

                        do {

                            cpfErrorLevel = 0;
                            System.out.print("Digite o CPF: ");
                            cpfString = teclado.next();
                            cpfString = cpfString.replaceAll("[^\\d]", "");
                           
                            // Coloca cada número da variável string no vetor
                            cpfVetor = new int[12];
                            for (int i = 0; i < 11; i++) {
                               cpfVetor[i] = cpfString.charAt(i) - '0';
                               System.out.println(cpfVetor[i]);
                            }
                            cpfVerificador = cpfVetor[1];
                            
                            // Verifica se o cpf contém outros caracteres além de números, mesmo que na linha 43 esteja ignorando
                            if (!cpfString.matches("[0-9]+")) {
                               System.out.println(" #! Por favor, digite apenas números.\n");
                               cpfErrorLevel++;
                            }                           
                             
                            // Verifica se o cpf é um sequência de números iguais
                            int a = 0;
                            for (int i = 0; i < 11; i++) {
                               if (cpfVetor[i] == cpfVerificador) {
                                    a++;
                                    
                               }
                            }
                            if (a >= 11) {
                               cpfErrorLevel++;
                               System.out.println(" #! Por favor, não digite números repitidos.\n");
                            }
                            
                            
                             
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
                        
                        
                    } while (cpfErrorLevel != 0);
                    break;
                    
                case "2":
                    System.out.print("Digite sua idade: ");
                    int x = teclado.nextInt();
                    if (x >= 0 && x <= 15) {
                        System.out.println("Você não pode votar");
                    } else if (x >= 18 && x <= 70) {
                        System.out.println("Você tem que votar");
                    } else {
                        System.out.println("Você pode votar se quiser");
                    }
                    break;
                case "4":
                    int valorFatorial, aux2 = 1;
                    do {
                        System.out.println("Digite um número de 1 a 12: ");
                        valorFatorial = teclado.nextInt();
                    } while (!(valorFatorial >= 1 && valorFatorial <= 12));

                    for (int i = 1; i <= valorFatorial; i++) {
                        aux2 *= i;
                    }
                    System.out.println("O fatorial de " + valorFatorial + " é igual a = " + aux2);
                    break;

                case "3":
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Tabuada do " + i + ":");
                        for (int j = 1; j <= 10; j++) {
                            System.out.println(i + " x " + j + " = " + (i * j));
                        }
                        System.out.println();
                    }
                    break;

                case "81":
                    System.out.println("Você entrou no while");
                    break;

                case "-5":
                    System.out.println("Digite um número entre -10 e 10: ");
                    x = teclado.nextInt();
                    if (x >= -10 && x != 0 && x <= 10) {
                        System.out.println("Parabéns, você sabe muito");
                    }
                    break;
                case "0":
                    if ( y > 0 ){
                        
                    y = 0;
                    }
                        
                default:
                    System.out.println("É isso aqui mesmo (switch-case)");
                    break;
            }

        } while (y == 1);
        //Lembrar de perguntar para o professor de explicar "=="
        System.out.println("Davi ou Marcelo, passa mais tarefa PFV");
        teclado.close();
    }
    public static void gabriel(){
                System.out.println("\n\n\n========== MENU PRINCIPAIS " + "ESTRUTURAS DE CONTROLE ==========");
            System.out.println("()default - switch-case");
            System.out.println("(1) Vetor");
            System.out.println("(2) IF");
            System.out.println("(3) for");
            System.out.println("(75864) if-else");
            System.out.println("(81) while");
            System.out.println("(4) do-While");
            System.out.println("(0) - Sair");
            System.out.println("=====================================================================");
            System.out.print("Digite um número: ");
            } 
    public static boolean CPFverificacao(){
    if (verifiCPF()){
    
    }
        
        
        return false;
        
    }
    public static boolean verifiCPF(){
       System.out.println("Validação de CPF");
                    int cpfErrorLevel;
                    int cpfVerificador;
                    int[] cpfVetor;
    Scanner teclado = new Scanner(System.in);
                    do {

                        String cpfString = "0";

                        do {

                            cpfErrorLevel = 0;
                            System.out.print("Digite o CPF: ");
                            cpfString = teclado.next();
                            cpfString = cpfString.replaceAll("[^\\d]", "");
                           
                            // Coloca cada número da variável string no vetor
                            cpfVetor = new int[12];
                            for (int i = 0; i < 11; i++) {
                               cpfVetor[i] = cpfString.charAt(i) - '0';
                               System.out.println(cpfVetor[i]);
                            }
                            cpfVerificador = cpfVetor[1];
                            
                            // Verifica se o cpf contém outros caracteres além de números, mesmo que na linha 43 esteja ignorando
                            if (!cpfString.matches("[0-9]+")) {
                               System.out.println(" #! Por favor, digite apenas números.\n");
                               cpfErrorLevel++;
                            }                           
                             
                            // Verifica se o cpf é um sequência de números iguais
                            int a = 0;
                            for (int i = 0; i < 11; i++) {
                               if (cpfVetor[i] == cpfVerificador) {
                                    a++;
                                    
                               }
                            }
                            if (a >= 11) {
                               cpfErrorLevel++;
                               System.out.println(" #! Por favor, não digite números repitidos.\n");
                            }
                            
                            
                             
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
                        
                        
                    } while (cpfErrorLevel != 0);
        return true;

 
    }
    
} 
