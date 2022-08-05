package smileGo;

/*ENUNCIADO DESSE DESAFIO ESTÁ ERRADO

"THE PRIME FACTORS OF A NUMBER ARE ALL OF THE INTEGERS BELOW THAT NUMBER THAT ARE DIVISIBLE INTO THE NUMBER AS WELL AS 1. FOR EXAMPLE,
THE PRIME FACTORS OF 12 ARE 1,2,3,4,6, ANDS 12.
CREATE A PRIME FACTORIZATION CALCULATOR THAT RETURNS THE PRIME FACTORS OF ANY NUMBER BETWEEN 2 AND 100."

NO ENUNCIADO ACIMA ELE DIZ QUE 1,2,3,4,6 E 12 SÃO OS PRIME FACTORS, QUANDO NA VERDADE SÃO FACTORS.
OS PRIMES FACTORS DE 12 SÃO 2,2 E 3.

PEGANDO O 12 COMO EXEMPLO FICARIA:
FATORES DE 12 = 1,2,3,4,6 E 12.

FATORES PRIMOS DE 12 = 2×2×3.

COMO NÃO SEI QUAL ESTÁ SENDO PEDIDO PELO ENUNCIADO ENTÃO IREI FAZER OS DOIS (FATORES E FATORES PRIMOS DE UM NÚMERO.)
*/
public class jPrimeFactorization {

	public static void fatoresPrimos(int numero) {
		int fatorPrimo = 2;
		while (numero > 1) {

			if (numero % fatorPrimo == 0) {
				System.out.print(fatorPrimo + " ");
				numero /= fatorPrimo;
			} else
				fatorPrimo++;
		}
	}

	public static void main(String[] args) {

		int numero = 12;

		System.out.print("Os Fatores de " + numero + " São: ");

		for (int i = 1; i <= numero; ++i) {

			if (numero % i == 0) {
				System.out.print(i + ", ");
				
			}
		}

		int numeroFP = 12;
		System.out.println(" ");
		System.out.print("Os Fatores Primos de " + numeroFP + " São: ");
        fatoresPrimos(numeroFP);
		
	}

}
