

public class Conta {

	/*atributos*/

	double saldo;
	int agencia;
	int numero; 
	Cliente titular; 

	
	
	
	
	/*métodos*/
	
	public void deposita(double valor) {
		this.saldo += valor;  
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
