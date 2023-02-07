package introduction;

public class TesteCondicional {
	
	public static void main(String[] args) {
	 	int idade = 21;
	 	int pessoas = 3;
	 	boolean acompanhado = false;
	 	
	 	
	 	
	 	if(idade >= 18) {
	 		System.out.println("voce tem mais de 18 anos shit;");  
	 	} else {
	 		System.out.println("felizmente vc ainda é jovem");
	 	}
	 	
	 	if(idade >= 18 || pessoas >= 2 ) {
	 		System.out.println("aproveite o show");
	 	}
	 	else {
	 		System.out.println("vai estudar");
	 	}
	 	
	 	if(idade >= 18 || (idade <= 18 && acompanhado == true)) {
	 		System.out.println("você esta no caminho certo");
	 	}else {
	 		System.out.println("sinto muito :(");
	 	}
	 	
	}
	
}
