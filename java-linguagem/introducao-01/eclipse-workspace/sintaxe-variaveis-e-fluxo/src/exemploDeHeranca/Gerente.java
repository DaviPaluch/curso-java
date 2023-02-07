package exemploDeHeranca;

public class Gerente extends Funcionario {
	/*a palavra reservada "extends" serve para o gerente herdar todas as caracteristicas do funcionario*/
	
	private int senha;
	
	public boolean autentication(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return Salario;
	}
	public String setSalario(double Salario) {
		super.Salario = Salario; /* super significa que o atributo acessa somente a classe mae (devo procurar o atributo em uma hierarquia maior). Mas posso usar o ".this". */
		return "saved sucessfully";
	}
}
