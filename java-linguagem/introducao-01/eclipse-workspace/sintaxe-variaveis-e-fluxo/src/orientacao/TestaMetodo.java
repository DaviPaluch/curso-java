package orientacao;

public class TestaMetodo {

	public static void main(String[] args) {
		 
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(70);
		boolean IsValid = conta.saca(50);
		System.out.println(conta.saldo);
		System.out.println(IsValid);
	}
	
}
