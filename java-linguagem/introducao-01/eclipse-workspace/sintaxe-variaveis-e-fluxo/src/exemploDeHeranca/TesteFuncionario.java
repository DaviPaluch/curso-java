package exemploDeHeranca;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico");
		nico.setCpf("000000000-0");
		nico.setSalario(40000);
		
		//nico.Salario = 10;	/*consigo editar pq? se o atributo é protected*/
		System.out.println(nico.getSalario());
		
		
	}
}
