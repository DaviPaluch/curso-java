
public class Banco {

	public static void main(String[] args) {
		
		
		Cliente Davi = new Cliente();
		Davi.tipoCliente = "pessoa fisica";
		Davi.cpf = "00000000000";
		Davi.nome = "DAVI PALUCH";
		
		Conta contaDavi = new Conta(); /* variavel temporaria */

		
		contaDavi.titular = Davi;
		/*ou: 
		 *contaDavi.titular = new Cliente(); */
		System.out.println("endereco na memoria: " + contaDavi.titular);
		
		System.out.println(contaDavi.titular.nome);
		
	}
	
}
