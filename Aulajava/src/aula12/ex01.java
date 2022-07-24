package aula12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
		String id_col="";
		String nome="";
		String setor="";
		String ideia="";
		int nideias = 0;
		
	do {
		id_col = JOptionPane.showInputDialog("Digite a identificação do colaborador: ");
		if(!id_col.matches("^[0-9]+$")) {
			System.out.println("Por favor, digite um numero valido");
		}
	}while(!id_col.matches("^[0-9]+$"));
	nideias = Integer.parseInt(JOptionPane.showInputDialog("quantas ideias deseja cadastrar: "));
	String info[][]=new String [nideias][3];
	
	for (int i = 0; i < info.length; i++) {
		do {
			nome=JOptionPane.showInputDialog("Digite nome do colaborador: ");
			info[i][0]=nome;
		}while(nome.isEmpty());
		
		do {
			setor = JOptionPane.showInputDialog("Digite o setor do colaborador: ");
			info[i][1] = setor;
		}while(nome.isEmpty());
		do {
			ideia = JOptionPane.showInputDialog("Digite o nome da ideia: ");
			info[i][2] = ideia;
		}while(nome.isEmpty());
	}
	int resposta = 0;
	resposta=Integer.parseInt(JOptionPane.showInputDialog(null, "deseja finalizar o programa com lista:"));
	if(resposta==1) {
		System.out.println("===================================================");
		for (int i = 0; i < info.length; i++) {
			System.out.println("Nome colaborador            setor          ideia");
			System.out.println(info[i][0]+"                          " + info[i][1] + "              "+ info[i][2]);
			System.out.println("====================================================");
		}
	}
	
	}

}
