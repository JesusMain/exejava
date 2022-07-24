package aula13;

import javax.swing.JOptionPane;

public class trabfinal {

	public static void main(String[] args) {
		String op="";
		String[] cliente=new String[20];
		String[] lanche=new String[20];
		String[] bebida=new String[20];
		int contaL=0;
		int contaB=0;
		int cont3=0;
		int i=0;
		double total=0;
		double lanh=0;
		double bebi=0;
		
		for (i = 0; i < 2; i++) {
		
			//while(!op.equals("N"))
			//{	
		cliente[i] = JOptionPane.showInputDialog("Digite nome do cliente: ");				
		int opL =Integer.parseInt( JOptionPane.showInputDialog(" 1- Dog frito 16,50  2-Dog quente 20,00  3-Dog late 16,00  4- Dog feio 15,00 "));
		if (opL==1) {
			lanh= 16.50;
			contaL++;
			lanche[i] = "Dog Frito";
		}
		if (opL==2) {
			lanh= 20.00;
			contaL++;
			lanche[i] = "Dog quente";
		}
		if (opL==3) {
			lanh= 16.00;
			contaL++;
			lanche[i] = "Dog late";
		}	
		if (opL==4) {
			lanh= 15.00;
			contaL++;
			lanche[i] = "Dog Feio";
		}
		int opB = Integer.parseInt( JOptionPane.showInputDialog(" 1- Água 5,00 2-Refri lata 8,00  3- Suco 8,00 4- Nenhuma "));

		if (opB==1) {
			bebi= 5.00;
			contaB++;
			bebida[i] = "Água";
		}
		if (opB==2) {
			bebi= 8.00;
			contaB++;
			bebida[i] = "Refri lata";
		}
		if (opB==3) {
			bebi= 8.00;
			contaB++;
			bebida[i] = "Suco";
		}
		if (opB==4) {
			bebi= 0.00;
			bebida[i] = "Nenhuma";
		}
		total=total+(bebi+lanh);
		System.out.println("##################");
		System.out.println("Cliente: "+cliente[i]);
		System.out.println("Valor: "+(bebi+lanh));
		System.out.println("##################");
		op = JOptionPane.showInputDialog("Deseja realizar outro pedido: S/N");	
		op=op.toUpperCase();
		if(op.equals("N")) {
			break;
		}
			
		//}
			
		}
		cont3=contaL+contaB-2;
		System.out.println("------Fechamento de Caixa-------");
		System.out.println("Valor total de vendas: R$ "+total+"\nLanches vendidos: "+contaL+" Bebidas: "+contaB);
		for (i = 0; i < cont3; i++) {
			
		
		System.out.println("Lanches: "+lanche[i]);
		System.out.println("Bebidas: "+bebida[i]);
		}
	}
}
