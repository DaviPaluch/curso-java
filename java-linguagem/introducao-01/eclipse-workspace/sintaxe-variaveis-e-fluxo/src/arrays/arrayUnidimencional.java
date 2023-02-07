package arrays;

public class arrayUnidimencional {

	public static void main(String[] args) {
		
		/*exemplo de inicializacao do array. Todos os valores iniciam com um valor default*/
		
		
		/*declaracao de array*/
		int[] idades; 
		
		/*declaracao e inicializacao do array*/
		double[] pesos = new double[10]; /*array de dez posicoes*/ 
		int[] variavel = new int[] {2,4,5,6,8,9}; /* valores que serao colocados no array*/
		
		System.out.println(pesos[4]);
		System.out.println(variavel[4]);
		
		Cliente[] clientes = new Cliente[] { new Cliente(), null, new Cliente()};
		
		/*declaracao*/
		int declara[];
		/*inicializacao*/
		declara = new int[] {0,5,7,7,96};
		
		System.out.println(declara.length);
		
		for(int i=0; i < declara.length;i++) {
			System.out.println(declara[i]);
		}
		
		
		
	}

	
}
