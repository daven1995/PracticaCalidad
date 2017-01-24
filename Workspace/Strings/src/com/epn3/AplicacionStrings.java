package com.epn3;
	import javax.swing.JOptionPane;
public class AplicacionStrings {
		public static void main(String[] args) {
			String salida="";
			ConjuntoStrings conjuntostring =new ConjuntoStrings();
			conjuntostring.String();
		salida+=conjuntostring.toString();
			JOptionPane.showMessageDialog(null, salida);
			conjuntostring.sortAscending();
			salida="Asciendeme"+conjuntostring.toString();
				JOptionPane.showMessageDialog(null, salida);
	}}
