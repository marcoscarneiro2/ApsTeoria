package com.suam.aps;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[]args) {
		String string = JOptionPane.showInputDialog("Digite aqui seu alfabeto");
		CharSequence ch;
		
		boolean value = false;
		
		while(!value) {	
		ch = JOptionPane.showInputDialog("Digite uma palavra");
		value = string.contains(ch);
		
		if(value == true) {
			JOptionPane.showMessageDialog(null, montaExibicao(ch, string));
		} 
		if(value !=true ) {
			JOptionPane.showMessageDialog(null, montaExibicaoErro(ch, string));
		}
	  }
		System.exit(0);
	}
	public static String montaExibicao(CharSequence ch,String string) {
		String exibicao = "";
		exibicao+=" ===================\n";
		exibicao+="A palavra "+ch+" pertence a palavra ∑ "+string;
		exibicao+="\n ===================";
		return exibicao;
	}
	public static String montaExibicaoErro(CharSequence ch,String string) {
		String exibicao = "";
		exibicao+=" ===================\n";
		exibicao+="A palavra "+ch+ " não pertence a palavra ∑ "+string;
		exibicao+="\n ===================";
		return exibicao;
	}
}

