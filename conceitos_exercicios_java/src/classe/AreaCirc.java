package classe;

public class AreaCirc {
	
	double raio;
	// static quer dizer que essa variável pertence a classe!
	static double pi = 3.14;
	
	// construtor
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	// método
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
