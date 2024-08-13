package controle;
import java.util.Scanner;
public class Copy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF (somente números): ");
        String cpf = scanner.nextLine();
        if (validarCPF(cpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
   public static boolean validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        int[] cpfArray = new int[11];
        for (int i = 0; i < 11; i++) {
            cpfArray[i] = cpf.charAt(i) - '0';
        }
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += cpfArray[i] * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += cpfArray[i] * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }
        return cpfArray[9] == digito1 && cpfArray[10] == digito2;
    }
}
    


