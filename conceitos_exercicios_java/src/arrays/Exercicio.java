package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {
	public static void main(String[] args) {
		// array fixo com 3 itens
		// tipo Array + nome variável = instanciação [tamanho do array]
		double[] notasAlunoA = new double[3]; // única dimensão
		
		// também posso escrever da seguinte forma
		double notasAlunoB[] = new double [3];
		
		double [] notaAlunoC = new double [3];
		
		System.out.println(Arrays.toString(notasAlunoA));// [0.0, 0.0, 0.0] sem atribuir valores
		
		// adicionando nota no array
		notasAlunoA[0] = 7.9; // [0] índice
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		// chamar classe Arrays
		System.out.println(Arrays.toString(notasAlunoA)); //[7.9, 8.0, 6.7]
		// pegar um elemento específico
		System.out.println(notasAlunoA[0] + " -> este é o index");
		// pegar a última nota
		System.out.println(notasAlunoA[notasAlunoA.length - 1] + " último index");
		
		// caso eu busque um elemento fora do array ele imprimirá um erro
		// System.out.println(notasAlunoA[4]); //ArrayIndexOutOfBoundsException
		
		// percorrendo o array
		
		double total = 0;
		for(int i = 0; i < 3; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / 3);
		
		// melhorando o código acima, em caso do Array mudar de tamanho
		
		double total2 = 0;
		for (int j = 0; j < notasAlunoA.length; j++) {
			total2 += notasAlunoA[j];
		}
		
		System.out.println(total2 / notasAlunoA.length);
		
		
		final double notaArmazenada = 8.9;
		double[] notasAlunoC = {6.9, 8.9, 5.5, 10, notaArmazenada}; // inicializando diretamente, com tamanho fixo
		
		double totalAlunoC = 0;
		for (int k = 0; k < notasAlunoC.length; k++) {
			totalAlunoC += notasAlunoC[k];
			
		}
		
		System.out.println(totalAlunoC / notasAlunoC.length);
			
		}
	}

