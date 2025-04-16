package oo.polimosfismo;
// sobrecarga de métodos! 
public class Pessoa {
	
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	// substituí os 3 métodos por 1. Através do polimorfismo!
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0)
		this.peso = peso;
	}
	
}


