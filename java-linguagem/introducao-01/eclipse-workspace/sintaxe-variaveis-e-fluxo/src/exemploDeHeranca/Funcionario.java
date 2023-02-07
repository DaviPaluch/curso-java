package exemploDeHeranca;

public class Funcionario {

	private String Cpf;
	private String Nome;
	protected double Salario; /*apenas as extensoes dessa classe podem acessar esse atributo*/
	
	
	public double getSalario() {
		return Salario;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getCpf() {
		return Cpf;
	}
	
	
	public String setNome(String nome) {
		this.Nome = Nome;
		return "saved Name: " + Nome;
	}
	public String setCpf(String Cpf) {
		this.Cpf = Cpf;
		return "saved Cpf";
	}
	public String setSalario(double Salario) {
		this.Salario = Salario;
		return "saved salario";
	}
	
	
	
	
	
}
