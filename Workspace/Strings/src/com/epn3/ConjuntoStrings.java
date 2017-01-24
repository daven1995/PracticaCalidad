package com.epn3;
import javax.swing.JOptionPane;

public class ConjuntoStrings {
	private String[] nombres;
	public ConjuntoStrings()
	{
		int longitud;
		longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de compañeros"));
		nombres= new String [longitud];}
public void String ()
{for(int i=0; i<this.nombres.length;i++)
	this.nombres[i]=JOptionPane.showInputDialog("Ingrese el nombre del compañero "+(i+1));}

public String[] getNombres() {
	return nombres;}

public void setNombres(String[] nombres) {
	this.nombres = nombres;}

public String toString(){
	String salida1="";
	for (int i=0; i<this.nombres.length;i++){
	salida1+="\n"+nombres[i]	;
	}return salida1;
	}

//https://www.facebook.com/pages/Full-Programaci%C3%B3n/284551031640278
	public void sortAscending(){
		String auxiliar;
		for (int i=0;i<this.nombres.length;i++)
	{for (int j=i+1;j<this.nombres.length;j++){
		if (this.nombres[i].compareTo(this.nombres[j])>0)
	{auxiliar=nombres[j];
	nombres[j]=nombres[i];
	nombres[i]=auxiliar;		}
	}
		
	}
}}



