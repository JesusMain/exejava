package aula05;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String []nome = new String[5];
		double[]nota = new double[5];
		
		double soma = 0;
		double media;
		int cont = 0;
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite o nome n: "+(1+1)+"° :  ");
			nome[i] = it.next();
			System.out.println("Digite a nota do nome n: "+(1+1)+"° :  ");
			nota[i] = it.nextDouble();
			soma = soma+nota[i];
			cont++;
		}
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("O aluno "+nome[i]+" Possui nota: "+nota[i]);
		}
			media = soma/cont;
			System.out.println("a soma :"+soma+" a media: "+media);
	}

}
