package smileGo;

public class ePangrams {

	public static void main(String[] args) {

		String frase = "he quick brown fox jumps over the lazy dog";
		System.out.println(verificandoPangram(frase.toLowerCase()));

	}

	private static boolean verificandoPangram(String frase) {

		if (frase.length() < 26) {
			return false;
		} else

			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (frase.indexOf(ch) < 0) {
					return false;
				}
			}
		return true;
	}

}
