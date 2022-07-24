package aula01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//classe Scanner trabalha com entrada de dados
		//o objeto Systen.in é o que faz a leitura do que se escreve no teclado.
		//ativar o metodo Scanner, ctrl+shift+ o...para importar biblioteca do scanner
		System.out.println("Digite Seu numero");
		int nome = leia.nextInt();
		
		System.out.println("Numero é: "+ nome);

	}

}
