package smileGo;

public class iPrimeNumberChecker {

	public static void main(String[] args) {

		int numero = 7;
		boolean numeroPrimo = true;

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				numeroPrimo = false;
				break;
			}
		}

		if (numeroPrimo) {
			System.out.println(true + ", " + numero + " é número primo.");
		} else
			System.out.println(false + ", " + numero + " não é número primo.");

	}

}
