package com.epn3;
import javax.swing.JOptionPane;
public class AplicacionEnteros
{public static void main(String[] args) {ConjuntoEnteros enteros= new ConjuntoEnteros();
		String salida="";
		enteros.insertarElemento();
		salida=enteros.toString()+"\n";
		salida+="La suma del vector es: "+enteros.Sumatorio()+"\n\n";
		enteros.eliminarElemento();
		salida+=enteros.toString();
		salida+="La suma despues de eliminar es: "+enteros.Sumatorio();
		JOptionPane.showMessageDialog(null, salida);
		JOptionPane.showMessageDialog(null,"Adios!");}}