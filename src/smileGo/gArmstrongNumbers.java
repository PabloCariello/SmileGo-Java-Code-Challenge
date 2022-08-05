package smileGo;

public class gArmstrongNumbers {

	public static void main(String[] args) {

		int numero = 153;
		int resultado = numero;
		int soma = 0;

		while (numero > 0) {
			int resto = numero % 10;
			soma = (soma) + (resto * resto * resto); //OBS: A quantidade de vezes que o resto vai multiplicar varia de acordo com quantos dígitos o número possui.
			numero /= 10;
		}

		if (resultado == soma) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
