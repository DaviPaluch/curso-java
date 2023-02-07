
//FATORIAL DE 0 A 10;

public class Fatorial {
	
	public static void main(String[] args) {
		
		
		for(int fatorial = 1; fatorial <= 10; fatorial++) {
			int multiplicador = 1;
			for(int contador = 1; contador <= fatorial; contador++) {
				int i = contador;
				
				multiplicador *= i; 
			}
			System.out.println();
			System.out.println("fatorial de "+ fatorial + " is " + multiplicador);
			
		}
	
	}
}
