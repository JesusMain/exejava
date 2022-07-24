package aulamatriz;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		String[][] nomesalunos = new String[5][5];

		for (int lin = 0; lin < nomesalunos.length; lin++) {
			for (int col = 0; col < nomesalunos[lin].length; col++) {
				System.out.println("Nome Aluno: "+lin + col);
				nomesalunos[lin][col] = it.next();
			}
		}
		for (int lin = 0; lin < nomesalunos.length; lin++) {
			for (int col = 0; col < nomesalunos[lin].length; col++) {
				System.out.print(nomesalunos[lin][col]+" - ");
			}
			System.out.println("");
		}
		
	}

}
