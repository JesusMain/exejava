package Aula02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
Scanner it= new Scanner(System.in);

System.out.println("Digite o valor para realizar a tabuada: ");
int valor = it.nextInt();

int i = 1;
while (i <= 10) 
{
	System.out.println( valor + " * " +i+ " = "+ valor * i);
	i++;
}
	}

}
