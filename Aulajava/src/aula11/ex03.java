package aula11;

import javax.swing.JOptionPane;

public class ex03 {

	public static void main(String[] args) {
		//erro por não digitar nada
		String nome="";
		String setor="";
		
		do {
			nome = JOptionPane.showInputDialog("Digite nome do colaborador: ");
			System.out.println("ERRO");
			
		}while(nome.isEmpty());
		do {
			setor=JOptionPane.showInputDialog("Digite o setor do colaborador: ");
					System.out.println("ERRO");
		}while(setor.isEmpty());
	}

}
