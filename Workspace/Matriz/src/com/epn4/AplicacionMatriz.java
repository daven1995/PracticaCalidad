package com.epn4;

import javax.swing.JOptionPane;



public class AplicacionMatriz {

	public static void main(String[] args) {
		Matriz matriz=new Matriz();
		String salida="";
	
		matriz.setMatriz();
		salida+="La matriz es:\n"+matriz.toString();
		salida+="La sumatoria de los "
				+ "elementos de la diagonal es:\n"+matriz.diagonal();
		salida+="\nLa sumatoria de los "
				+ "elementos de la diagonal inversa"
				+ " es:\n"+matriz.diagonalinversa();
		Matriz matriz2= new Matriz();
		matriz2.setMatriz();
		salida+="\n    Matriz 2  \n"+matriz2.toString();
		Matriz matrizSuma=matriz.sumaMatriz(matriz2);
		salida+="\n   Suma de Matrices  \n"+matrizSuma.toString();
		Matriz matrizProd=matriz.producto(matriz2);
		salida+="\n  Producto de Matrices  \n"+matrizProd.toString();
		JOptionPane.showMessageDialog(null, salida);
		salida="Adios!";
		JOptionPane.showMessageDialog(null, salida);
	}

}
