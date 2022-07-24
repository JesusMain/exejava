package Aula02;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "" ;
		String esp = "" ;
		
		while (!nome.equals("SAIR"))
		{
			System.out.println("Informe nome do paciente: SAIR para sair ");
			nome = it.next();		
			nome = nome.toUpperCase();
			
			if(!nome.equals("SAIR")) 
			{
				System.out.println("Informe especialidade do medico: ");
				System.out.println("1 - OTORRINO  2 - OUTRO" );
				esp = it.next();
				if(esp.equals("1")) 
				{
				System.out.println("Valor da consulta: R$ 180,00");
				}else
				{
				System.out.println("Valor da consulta: R$ 100,00");	
				}
			} 
		}

	}

}
