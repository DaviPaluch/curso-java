package introduction;

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		
		System.out.println("meu salario é: " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
	
		double outraDivisao = 5/2;
		System.out.println(outraDivisao);
		/*No exemplo acima o java primeiro executa 
		 * 5/2  ,ou seja, int/int.
		 * resultado: 2
		 * depois atribui a variavel outra divisao.*/

		double maisUmaDivisao = 5.0/2;
		System.out.println("divisao certa: "+outraDivisao);
		/*basta colocar um double para ele raciocinar*/
	
	}
	
}
