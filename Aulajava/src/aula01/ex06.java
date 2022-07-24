package aula01;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("qual seu nome: ");
		String nome = in.next();
		System.out.println("Digite sua cor favorita: ");
		String cor = in.next();
		
		cor = cor.toUpperCase();
		//para maiusculo
		//para minusculo usar : cor = cor.tolowerCase()
		if(cor.equals("AZUL")) {
		System.out.println(nome+"Voce é Gremista ");
		}
		else {
		}
		if(cor.equals("VERMELHO")) {
			System.out.println(nome+"Voce é Colorado ");
			}
			else {
			System.out.println(nome+"Voce é outro time: ");
			}
	}

}
