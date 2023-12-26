package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "verde"; // executará tudo que está abaixo da verde, até o break
		
		
		// estrutura
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
		System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("SEi o Heian Godan");
		case "verde":
			System.out.println("SEi o Heian Yodan");
		case "laranja":
			System.out.println("SEi o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		break;
			
		default:
			System.out.println("Não sei de nada!");
		}
		
	}

}
