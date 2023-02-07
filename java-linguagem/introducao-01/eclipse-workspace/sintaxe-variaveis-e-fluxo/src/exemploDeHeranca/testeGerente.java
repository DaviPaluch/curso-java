package exemploDeHeranca;

public class testeGerente {

	public static void main(String[] args) {
		Gerente davi = new Gerente();
		davi.setSalario(2000);
		
		System.out.println(davi.getBonificacao());
	}
}
