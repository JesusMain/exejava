package aulamatriz;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] notasalunos = new double[3][4];
		
		notasalunos[0][0]= 10;
		notasalunos[0][1]= 7;
		notasalunos[0][2]= 8;
		notasalunos[0][3]= 9;
		
		notasalunos[1][0]= 9;
		notasalunos[1][1]= 8;
		notasalunos[1][2]= 7;
		notasalunos[1][3]= 9;
		
		notasalunos[2][0]= 7;
		notasalunos[2][1]= 10;
		notasalunos[2][2]= 7.5;
		notasalunos[2][3]= 8;
		
		for (int lin = 0; lin < notasalunos.length; lin++) {
			for (int col = 0; col < notasalunos.length; col++) {
				System.out.print(notasalunos[lin][col]+" - ");
			}
			System.out.println("");
		}
	}

}
