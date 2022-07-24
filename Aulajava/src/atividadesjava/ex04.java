package atividadesjava;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int []numero = new int[5];
		
		int i;
		
		for (i = 0; i < 5; i++) {
		System.out.println("Informe os numeros: ");
		numero[i] = it.nextInt();
		}
		for (i = numero.length - 1; i >= 0 ; i--) {
            System.out.println(numero[i]);
			}
	}

}
