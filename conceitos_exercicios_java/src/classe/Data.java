package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	// construtor padrão COM DATA PADRÃO
	Data(){
		// dia = 1; 
		// mês = 1;
		// ano = 1970;
		
		this(1,1,1970);
	}

	// três parâmetros
	Data(int novoDia, int novoMes, int novoAno){
		this.dia = novoDia; // Acessar variável de INSTÂNCIA com this
		this.mes = novoMes;
		this.ano = novoAno;
		
	}
	// String obterDataFormatada() {
		// return String.format("%d/%d/%d", dia,mês,ano);
	
		final String formato = "%d/%d/%d";
		
		String obterDataFormatada() {
			return String.format(formato, dia, mes, ano);
		}
		// variável LOCAL definida dentro método obterDataFormatada
		
		
	}
	// this está associado a instância da classe

		//


