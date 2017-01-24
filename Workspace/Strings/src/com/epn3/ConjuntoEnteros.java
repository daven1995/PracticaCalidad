package com.epn3;
import java.util.Random;
import javax.swing.JOptionPane;
public class ConjuntoEnteros {
	private boolean vector[]; 
	public ConjuntoEnteros () 
		{int longi;
		longi=Integer.parseInt(JOptionPane.showInputDialog("Ingresar longitud de vector"));
		vector=new boolean [longi];} 
	public boolean[] getVector() 
		{ return vector;} 
	public void setVector() 
		{ for(int i=0;i<this.vector.length;i++){
		this.vector[i]=false;}} 
	public void insertarElemento() 
		{ Random insert = new Random();
		for(int i=0; i<=((vector.length)/2);i++){
		int aux=1+insert.nextInt((vector.length)/2);
		for(int j=0;j<vector.length;j++){
			if(j==aux){
				vector[j]=true;}}}} 
	public void eliminarElemento() 
		{ int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea eliminar"));
		for(int i=0;i<vector.length;i++){if(i==valor){
			vector[i]=false;}}} 
	public String toString() 
		{ String salida="";
	        for (int i=0; i<this.vector.length;i++)
	        	if(vector[i]==true){
					salida+="Vector: "+ i+"\n";}
	        return salida;}
	public int Sumatorio() 
		{int sumatorio=0; 
			for(int i=0;i<vector.length;i++) 
				{if(vector[i]==true) 
						sumatorio+=i;} 
		return sumatorio;}}