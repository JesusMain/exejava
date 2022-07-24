package aula11;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo="";
		String nome="";
		int contadorI=0;
		int contadorN=0;
		do {
			codigo=JOptionPane.showInputDialog("Digite o codigo do paciente: ");
			if(codigo.matches("[^[0-9]+$]*")) {
			//essa expressão só permite as letras de - A a A e todas as letras de que estar em 
			//A-Z a-z maiuscula e minuscula	
				do {								
				nome=JOptionPane.showInputDialog("Digite nome do paciente: ");
				}while(nome.isEmpty());
			}else 
				System.out.println("Por favor insira um nome valido");
				contadorI++;
		}while (!codigo.matches("[^[0-9]+$]*"));
	System.out.println("nome: "+nome+"");
	}

}
