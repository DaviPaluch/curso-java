package introduction;

public class testaConversao {
	
	public static void main(String[] args) {
		double salario = 1250.50;
		float pontoFlutuante = 3.14F; //32bits
		int valor = (int) salario; //32 bits (dois bilhões)
		System.out.println(valor);
		
		long numeroGrande = 35485462163546332L; //64 bits 
		short valorPequeno = 2406; //16 bits
		byte b = 127; //um byte vai de -128 até 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
	
}
