package aula03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "";
		float acumulador = 0;
		
		
		while(!nome.equals("SAIR"))
		{
			
			System.out.println("Informe seu nome");
			nome = it.next();
			nome = nome.toUpperCase();
			
			if(!nome.equals("SAIR")) 
			{
			System.out.println("Informe seu salario: ");
			float salario = it.nextFloat();
			acumulador =acumulador + salario;
		}
			}
		System.out.println("Devemos pagar o valor acumulado de : "+acumulador+" salarios");
		
	}

}
