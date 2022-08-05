package smileGo;

import java.util.Arrays;

public class hProductMaximizer {

	public static void produtoMaximo(int[] numeros) {

		int primeiroNumero = 0;
		int segundoNumero = 0;

		for (int numero : numeros) {
			if (numero > primeiroNumero) {
				segundoNumero = primeiroNumero;
				primeiroNumero = numero;
			} else if (numero > segundoNumero) {
				segundoNumero = numero;
			}

		}
		System.out.println("Os maiores números da array são: " + primeiroNumero + " e " + segundoNumero);
		System.out.println("O produto dos dois maiores números é: " + primeiroNumero * segundoNumero);

	}

	public static void main(String[] args) {

		int[] numeros = { 1, 6, 3, 2 };
		System.out.println("array de números: " + Arrays.toString(numeros));
		produtoMaximo(numeros);

	}

}
