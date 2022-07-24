package aula01;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);

System.out.println("Digite o primeiro Valor: ");
int valor1 = leia.nextInt();

System.out.println("Digite o Segundo Valor: ");
int valor2 = leia.nextInt();
		
int total = 0;
total = valor1 + valor2;

System.out.println("A soma dos valores é: "+total);
	}

}
