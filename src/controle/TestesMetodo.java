package controle;
public class TestesMetodo {
    // Método que retorna a soma de dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sem retorno que imprime uma mensagem na tela
    public void imprimirMensagem() {
        System.out.println("Olá, mundo!");
    }

    public static void main(String[] args) {
        TestesMetodo exemplo = new TestesMetodo();

        // Chamando o método somar e armazenando o resultado em uma variável
        int resultado = exemplo.somar(5, 3);
        System.out.println("A soma é: " + resultado);

        // Chamando o método imprimirMensagem
        exemplo.imprimirMensagem();
    }
}
