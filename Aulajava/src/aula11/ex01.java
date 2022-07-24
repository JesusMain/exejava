package aula11;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aluno="";
		int id=0;
		int nota=0;
		int contador=0;
		int contadorR=0;
		
		while(!aluno.equals("SAIR")) {
			//id=Integer.parseInt(JOptionPane.showInputDialog("Informe seu ID: "));
			nota=Integer.parseInt(JOptionPane.showInputDialog("Informe a Nota do aluno: "));
			aluno=JOptionPane.showInputDialog("Informe seu nome, ou sair: ");
			aluno=aluno.toUpperCase();
			
			if (nota>6) {
			contador++;
		}else {
			contadorR++;
		}	
			}
		JOptionPane.showMessageDialog(null, String.format("Alunos aprovador: "+contador+"\nReprovados: "+contadorR));
		
	}

}
