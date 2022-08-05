package smileGo;

import java.util.Arrays;

public class dAnagrams {

	static boolean verificandoAnagrama(String A, String B) {

		if (A == null || B == null || A.length() != B.length())

			return false;
		return Arrays.equals(A.toLowerCase().codePoints().sorted().toArray(),
				B.toLowerCase().codePoints().sorted().toArray());

	}

	public static void main(String[] args) {

		System.out.println(verificandoAnagrama("SmileGo", "GoSmile"));
		System.out.println(verificandoAnagrama("SMILEGO", "gosmile"));
		System.out.println(verificandoAnagrama("FirstTime", "Java"));
		System.out.println(verificandoAnagrama("", "Java"));

	}

}
