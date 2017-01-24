package com.epn2;
import javax.swing.JOptionPane;
public class AplicacionDecimal {
public static void main(String[] args){Decimal flotante= new Decimal();
	double aux = 0;	int auxil;
	do{String salida="";
	aux=Double.parseDouble(JOptionPane.showInputDialog(null, "Digita un numero"));
	flotante.setX(aux);
	salida+="La Parte Entera de ese número es: "+ flotante.Entero();
	salida+="\nLa Parte Decimal de ese número es: "+ flotante.Decimal(flotante.Entero());
	salida+="\nLa fraccion de ese número es: "+ flotante.Numerador2(flotante.mcd(flotante.Numerador(),flotante.Denominador(flotante.Decimal(flotante.Entero()))), flotante.Numerador()) +"/ ";
	salida+=flotante.Denominador2(flotante.mcd(flotante.Numerador(),flotante.Denominador(flotante.Decimal(flotante.Entero()))), flotante.Denominador(flotante.Decimal(flotante.Entero())));
	salida+="\nEl numerador de la fraccion de ese número es: "+ flotante.Numerador2(flotante.mcd(flotante.Numerador(),flotante.Denominador(flotante.Decimal(flotante.Entero()))), flotante.Numerador()) ;
	salida+="\nEl denominador de la fraccion de ese número es:"+flotante.Denominador2(flotante.mcd(flotante.Numerador(),flotante.Denominador(flotante.Decimal(flotante.Entero()))), flotante.Denominador(flotante.Decimal(flotante.Entero())));
	salida+="\n      * * Para escojer otro numero pulse 1 * *\n         * * Para salir pulse otro numero * *";
			auxil =Integer.parseInt(JOptionPane.showInputDialog(null, salida));
	}while(auxil==1);
JOptionPane.showMessageDialog(null,"Adios!");}}
