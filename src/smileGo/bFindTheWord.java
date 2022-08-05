package smileGo;

public class bFindTheWord {

	public static void main(String[] args) {

		String frase = "I love SmileGo";
		String[] smileGo = frase.split(" ");

		if (smileGo.length > 1) {
			System.out.println("A penultima palavra é: " + smileGo[smileGo.length - 2]);
		}else {
			System.out.println("Error: Insira 2 palavras ou mais para ser possível achar a penultima.");
		}
	}

}
