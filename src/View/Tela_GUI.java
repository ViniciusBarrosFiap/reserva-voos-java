package View;

import javax.swing.JOptionPane;

public class Tela_GUI {
	public static String op = "";
	public static void Tela() {
		int val = 0;
		while (val != 3) {
			op = JOptionPane.showInputDialog(null, "Selecione\n1-Consultar CPF\n2-Efetuar Reserva\n3-Sair"); 
			val = Integer.parseInt(op);
			if (val == 1) {
				
			}
		}
	}
}
