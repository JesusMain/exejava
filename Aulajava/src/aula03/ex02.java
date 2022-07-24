package aula03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "";
		String op = "";
		int contadorM = 0;
		int contadorF = 0;
		double acumuladorF = 0;
		double acumuladorM = 0;
		
		while(!op.equals("1"))
		{			
			if(!op.equals("1")) 
			{
			System.out.println("Informe o nome do gestor: ");
			nome = it.next();
			nome = nome.toUpperCase();
			System.out.println("Sexo: 1 - Feminino 2 - Masculino");
			String sexo = it.next();
			System.out.println("Digite o salario: ");
			double salario = it.nextDouble();
			
			if(sexo.equals("2"))
			{
			contadorM = contadorM +1;
			acumuladorM = acumuladorM+salario;
			}else if (sexo.equals("1"))
			{
				contadorF=contadorF+1;
				acumuladorF=acumuladorF+salario;
			}
			
			System.err.println("Deseja continuar: 1 - Não | 2 - Sim");
			op = it.next();
			
			}
		}
		System.out.println("Quantidade de homens: "+contadorM+" quantidade de mulheres: "+contadorF);
		System.out.println("Salario dos homens: "+acumuladorM+" Salario das mulheres: "+acumuladorF);

	}

}