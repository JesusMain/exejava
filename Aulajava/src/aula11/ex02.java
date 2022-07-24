package aula11;

import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
		// verifica se e numero valido, entre 0 - 9
		String id_col = "";
		
		do {
			id_col=JOptionPane.showInputDialog("Digite a identificação do colaborador: ");
			
			if(!id_col.matches("^[0-9]+$")) {
				System.out.println("Por Favor, digite um numero válido");
			}
		}while(!id_col.matches("^[0-9]+$"));
	}

}
