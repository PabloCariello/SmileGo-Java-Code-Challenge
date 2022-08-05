package smileGo;

public class aWordReversal {

	public static void main(String[] args) {

		String frase = "SmileGo is the best";
		String smileGo[] = frase.split(" ");

		for (int i = 0; i < smileGo.length; i++) {
			System.out.print(smileGo[i] + " ");
		}

		System.out.println("");

		for (int i = smileGo.length - 1; i >= 0; i--) {
			System.out.print(smileGo[i] + " ");
		}
	}

}
