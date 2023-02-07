package orientacao;

public class CriarConta {

	public static void main(String[] args) {
		
		/* "new" é usado para criar o objeto (colocar na memória) */
		Conta contaUsuario01 = new Conta();
		/* contaUsuario" é um ponteiro para um espaço na memoria
		 * e não é o objeto em si, mas sim uma referência.  */
		
		
		/* atribuição a uma parte da estrutura */
		contaUsuario01.saldo = 300;
		
		System.out.println(contaUsuario01.saldo);
		
		Conta contaUsuario02 = new Conta();
		
		contaUsuario02.saldo = 100;
		System.out.println(contaUsuario02.saldo);
		
		
		/*valores default*/
		System.out.println("numero default: " + contaUsuario01.numero);
		System.out.println("titular default: " + contaUsuario01.titular);
		
		
		
	}
	
}
