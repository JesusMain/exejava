package aula05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String[] gestor = new String[5];
		double[] salario = new double[5];
		double acumula = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do Gestor: "+(i+1)+" ° : ");
			gestor[i] = it.next();
			System.out.println("Digite o Salario do Gestor: "+(i+1)+" ° : ");
			salario[i] = it.nextDouble();
			
			if(salario[i]>5000) {
				acumula = acumula + salario[i];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("O Gestor "+gestor[i]+"recebe: "+salario[i]);
		}
		System.out.println("O gestores com salario maior que 5000, acumulam o valor: "+acumula);
		
	}

}
