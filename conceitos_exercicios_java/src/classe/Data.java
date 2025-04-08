package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	// construtor padrão COM DATA PADRÃO
	Data(){
		// dia = 1; // para setar valor padrão
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
		// não precisa passar parâmetros, porque os atributos que usarei já estão dentro do objeto
		String obterDataFormatada() {
			return String.format(formato, dia, mes, ano);
		}
		// variável LOCAL definida dentro método obterDataFormatada
		
		
	}
	// this está associado a instância da classe

		//
	// valores padrões para os tipos primitivos
	// byte, short, int, long -> 0
	// float, double -> 0
	// boolean -> false
	// objetos -> null (nulo, significa que não aponta para nenhum endereço de memória)

