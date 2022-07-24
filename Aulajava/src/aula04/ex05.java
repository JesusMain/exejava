package aula04;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		String nome = "";
		int numero;
		int contadorMN = 0;
		int contadorFN = 0;
		int contadorM = 0;
		int contadorF = 0;
		int nota;
		while(!nome.equals("SAIR"))
		{
		System.out.println("Numeros de alunos : ");
		numero = it.nextInt();
		if(!nome.equals("SAIR")) 
		{
		for (int i = 0; i < numero; i++) {
		
			System.out.println("Informe o nome do aluno: ");
			nome = it.next();
			nome = nome.toUpperCase();
			System.out.println("Sexo: 1 - Feminino 2 - Masculino");
			String sexo = it.next();
			System.out.println("Digite a Nota: ");
			nota = it.nextInt();			
			if(sexo.equals("2"))
			{
				if(nota >= 7) {
			contadorMN = contadorMN +1;	
				}else {
			contadorM = contadorM +1;	
			}
			}else if (sexo.equals("1"))
			{
				if(nota >=7) {
				contadorFN = contadorFN+1;	
				}else {
				contadorF=contadorF+1;
				}
			}								
			}
		}
		System.out.println("Alunos do sexo feminino aprovados: "+contadorFN);
		System.out.println("Alunos do sexo feminino Reprovados: "+contadorF);
		System.out.println("Alunos do sexo Masculino aprovados: "+contadorMN);
		System.out.println("Alunos do sexo feminino Reprovado: "+contadorM);		
		}	
	}
}
