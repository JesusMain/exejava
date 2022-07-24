package atividadesjava;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int []numero = new int[10];
		int num =0;
		
		for (int i = 0; i < 10; i++) {
		System.out.println("Informe os numeros: ");
		numero[i] = it.nextInt();
		if(numero[i]>num) {
			num = numero[i];
			}
		}
		System.out.println("O numero maior é: "+num);
		
	}

}
