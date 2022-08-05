package smileGo;

public class fNumberReversal {

	public static void main(String[] args) {
		
		long numero = 123456789;
		long numeroReverso = 0;
		
		System.out.println(numero);
		
		while(numero != 0) {
			
			long restoDaDivisao = numero % 10;
			numeroReverso = numeroReverso * 10 + restoDaDivisao;
			numero /= 10;
		}
		
		System.out.println(numeroReverso);
		
	}
	
}
