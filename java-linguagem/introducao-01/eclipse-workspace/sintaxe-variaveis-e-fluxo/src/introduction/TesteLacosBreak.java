package introduction;

public class TesteLacosBreak {

	public static void main(String[] args) {
		for(int contador = 0; contador < 10; contador++) {
			for(int linha = 0; linha < 10; linha++) {
				if(linha == contador) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
