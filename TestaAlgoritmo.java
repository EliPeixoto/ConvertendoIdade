package ConvertendoIdade;

public class TestaAlgoritmo {
	
	/* Exercicio: Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
	 *  Leve em considera��o o ano com 365 dias e o m�s com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

	public static void main(String[] args) {
		Pessoa eliane = new Pessoa();
		eliane.setAnos(1);
		eliane.setMeses(10);
		eliane.setDias(200);
		

		System.out.println("A Eliane tem: " + 
		eliane.getAnos() + " anos, " + eliane.getMeses() + " Meses e " + eliane.getDias() + " Dias" );
	
	System.out.println("Isso em dias � igual a : " + eliane.getIdade() );
	}
	
	
	
}




