package com.suam.aps;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[]args) {
		String string = JOptionPane.showInputDialog("Digite uma palavra");
		CharSequence ch;
		CharSequence ch1;
		CharSequence ch2;
		boolean value = false;
		
		while(!value) {	
		ch = JOptionPane.showInputDialog("Digite letras");
		value = string.contains(ch);
		
		ch1 = JOptionPane.showInputDialog("Digite letras");
	    value = string.contains(ch1);
		
		ch2 = JOptionPane.showInputDialog("Digite letras");
		value = string.contains(ch2);
		
		if(value == true) {
			JOptionPane.showMessageDialog(null, montaExibicao(ch,ch1,ch2, string));
		} 
		if(value !=true ) {
			JOptionPane.showMessageDialog(null, montaExibicaoErro(ch,ch1,ch2, string));
		}
	  }
		System.exit(0);
	}
	public static String montaExibicao(CharSequence ch,CharSequence ch1,CharSequence ch2,String string) {
		String exibicao = "";
		exibicao+=" ===================\n";
		exibicao+="As letras "+ch+" "+ch1+" "+ch2+ " contem na palavra "+string;
		exibicao+="\n ===================";
		return exibicao;
	}
	public static String montaExibicaoErro(CharSequence ch,CharSequence ch1,CharSequence ch2,String string) {
		String exibicao = "";
		exibicao+=" ===================\n";
		exibicao+="As letras "+ch+ " "+ch1+" "+ch2+ " não contem na palavra "+string;
		exibicao+="\n ===================";
		return exibicao;
	}
}

