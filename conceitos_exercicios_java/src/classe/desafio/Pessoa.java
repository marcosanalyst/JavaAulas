package classe.desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	
	 Pessoa(String nomePessoa, double pesoPessoa){
		 this.nomePessoa = nomePessoa;
		 this.pesoPessoa = pesoPessoa;
		
	}
	// Método COMER
	 
	 void comer(Comida comida) {
		 if(comida != null) {
			 this.pesoPessoa += comida.peso;
			 
		 }
	 }

	 String apresentar() {
		 return "Olá eu sou o/a " + nomePessoa + " e tenho " + pesoPessoa +
				 " Kgs.";
	 }
}
