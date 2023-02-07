package orientacao;

public class Conta {


	double saldo; /* private bloqueia ediçao e visualizaçao do atributo em outras classes */
	private int agencia;
	int numero = 777; /*consigo atribuir um valor default para a variavel aqui */
	String titular;

	
	
	
	/*métodos*/
	
	/*void não retorna resposta*/
	public void deposita(double valor) {
		this.saldo += valor;  /*this é uma palavra chave que faz referencia 
								ao endereço da memoria que estamos trabalhando*/ 
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			
			return false; 
		}
		
	}
	
}
