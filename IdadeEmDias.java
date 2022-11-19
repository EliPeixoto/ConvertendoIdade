package ConvertendoIdade;

public class IdadeEmDias {
	public int anos;
	public int meses;
	public int dias;


	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;

	}
	
	public int getIdade() {
		return anos * 365 + meses * 30 + dias;
	}

	//Não era preciso criar 
//	public void setIdade(int idade) {
//		this.idade = idade;
//
//	}
	
}
