package arrays;

public class ArrayUnidimencionalReferencias {

	public static void main(String[] args) {
		pessoa[] variavel = new pessoa[10];
		
		System.out.println(variavel[0].nome); /*array null, cuidar para nao levar erro de null pointer*/
		
		
		
	}

	
}

class pessoa{
	int id;
	int nome;
}