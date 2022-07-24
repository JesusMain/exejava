package atividadesjava;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int []numero = new int[10];
		int num = 0;
		int i;
		
		for (i = 0; i < 10; i++) { 
		System.out.println("Informe os numeros: ");
		numero[i] = it.nextInt();
	}
		for(i=0;i<numero.length;i++) {
		      if(numero[i] < numero[0]) {
		        num = numero[i];
		}}
		System.out.println("O numero menor é: "+num);
	}
}
