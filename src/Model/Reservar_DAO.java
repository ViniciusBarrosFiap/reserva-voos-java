package Model;

import javax.swing.JOptionPane;

public class Reservar_DAO {
	public static String [] numVoos = new String[5];
	public static String [] oriVoos = new String[5];
	public static String [] destVoos = new String[5];
	public static String op = "";
	public static void DoReserve() {
		int val = 0;
		while (val != 2) {
			op = JOptionPane.showInputDialog(null, "Digite o número do voo: "); 
			for(int i = 0; i<5; i++) {
				if (numVoos[i].equals("")) {
					numVoos[i] = op;
				}
			}
		}
	}
	}
}
