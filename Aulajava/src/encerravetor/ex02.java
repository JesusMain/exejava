package encerravetor;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		String []nome = new String[10];
		int []sexo = new int[10];
		int contadorM=0;
		int contadorF=0;
		
		for (int i = 0; i < sexo.length; i++) {
			System.out.println("Informe o nome dos pacientes: ");
			nome[i] = it.next();
			System.out.println("Informe o sexo: 1 - Masculino  2 - Feminino");
			sexo[i] = it.nextInt();
			
			if (sexo[i]==1) {
				contadorM=contadorM+1;
			}else if(sexo[i]==2) {
				contadorF=contadorF+1;
			}
		}
		System.out.println("Numero de paciente masculino: "+contadorM);
		System.out.println("Numero de pacientes Feminino: "+contadorF);
	}

}
