package Calculadora;

public class TestesJUnit {
	
	Calculadora calculando = new Calculadora();
	
	// Método para testar a soma de dois números positivos
	public void soma1() {
		int resultado = calculando.somar(10, 20);
		System.out.println("RESULTADO: " + resultado);		
	}

	// Método para testar a soma de um número positivo e um número negativo
	public void soma2() {
		int resultado = calculando.somar(5, -3);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a soma de um número positivo e zero
	public void soma3() {	
		int resultado = calculando.somar(7, 0);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a soma de dois zeros
	public void soma4() {
		int resultado = calculando.somar(0, 0);
		System.out.println("RESULTADO: " + resultado);	
	}

	// Método para testar a subtração de dois números inteiros positivos
	public void subtracao1() {
		int resultado = calculando.subtrair(15, 5);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a subtração de um número inteiro positivo e um número negativo
	public void subtracao2() {
		int resultado = calculando.subtrair(10, -2);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a subtração de um número inteiro positivo e zero
	public void subtracao3() {
		int resultado = calculando.subtrair(7, 0);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a subtração de dois zeros
	public void subtracao4() {
		int resultado = calculando.subtrair(0, 0);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a multiplicação de dois números inteiros positivos
	public void multiplicacao1() {
		int resultado = calculando.multiplicar(3, 6);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a multiplicação de um número inteiro positivo e um número negativo
	public void multiplicacao2() {
		int resultado = calculando.multiplicar(5, -2);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a multiplicação de um número inteiro positivo e zero
	public void multiplicacao3() {
		int resultado = calculando.multiplicar(9, 0);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a multiplicação de dois zeros
	public void multiplicacao4() {
		int resultado = calculando.multiplicar(0, 0);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a divisão de dois números inteiros positivos
	public void divisao1 () {
		int resultado = calculando.dividir(20, 4);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a divisão de um número inteiro positivo e um número negativo
	public void divisao2() {
		int resultado = calculando.dividir(15, -5);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a divisão por zero
	public void divisao3() {
		int resultado = calculando.dividir(9, 0);
		System.out.println("RESULTADO: " + resultado);
	}

	// Método para testar a divisão de zero por zero
	public void divisao4() {
		int resultado = calculando.dividir(0, 0);
		System.out.println("RESULTADO: " + resultado);
	}
}
