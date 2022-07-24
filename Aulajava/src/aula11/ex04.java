package aula11;

import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		
		do {
			nome=JOptionPane.showInputDialog("Digite o nome do Medico: ");
			if(nome.matches("[A-Z a-z]*")) {
			//essa expressão só permite as letras de - A a A e todas as letras de que estar em 
			//A-Z a-z maiuscula e minuscula	

				System.out.println("Médico: "+nome+" ------ nome valido");
			}else 
				System.out.println("Por favor insira um nome valido");
			
		}while (!nome.matches("[A-Z a-z]*"));
	}

}
