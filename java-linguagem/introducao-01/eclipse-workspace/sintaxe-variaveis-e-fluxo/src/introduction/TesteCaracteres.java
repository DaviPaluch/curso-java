package introduction;

public class TesteCaracteres {

	public static void main(String[] args) {
		char letra = 'a'; /*char guarda uma unica letra, 16 bits.
		 					É na verdade um número que faz referenci a a tabela ASCCI*/
		System.out.println(letra);
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		
		String palavra = "string não é um tipo de variavel. é a penas uma referência :) ";
		System.out.println(palavra);
	}
	
}
 