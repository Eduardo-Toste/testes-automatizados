package Calculadora;

public class Calculadora {
	
	// FUNCAO UTILIZADA PARA SOMAR DOIS VALORES
    public int somar(int a, int b) {
        return a + b;
    }

    // FUNCAO UTILIZADA PARA SUBTRAIR DOIS VALORES
    public int subtrair(int a, int b) {
        return a - b;
    }

    // FUNCAO UTILIZADA PARA MULTIPLICAR DOIS VALORES
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // FUNCAO UTILIZADA PARA DIVIDIR DOIS VALORES
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}