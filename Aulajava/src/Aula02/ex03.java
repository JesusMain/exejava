package Aula02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it= new Scanner(System.in);

	for (int i = 0; i < 10; i++) {
		System.out.println("Digite o Nome:  ");
		String nome = it.next();
		
		System.out.println("Digite a media final: ");
		int nota = it.nextInt();
		
		if(nota >= 7) 
		{
			System.out.println(nome+" Você foi Aprovado!");
		}
			if(nota < 7) {
			System.out.println(nome+" Voce Foi reprovado");
			}
			
	}
	
	}

}
