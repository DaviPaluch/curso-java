package orientacao;

public class TesteReferencias {

	
	public static void main(String[] args) {
		
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		/*aqui estou copiando a referência ou espaço da memoria que o objeto está guardado*/
		Conta segundaConta = primeiraConta;
		
		primeiraConta.saldo -= 60;
		
		System.out.println(segundaConta.saldo);
		
	}
}
