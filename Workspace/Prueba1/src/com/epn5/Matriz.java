package com.epn5;

import javax.swing.JOptionPane;

public class Matriz {
	private int [][] matriz;
	public Matriz(){
		int f=Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de filas y columnas"));
		int c=f;
		if (f==c)
			matriz=new int [f][c];
}
	
public String toString(){
	String salida="";
	for(int i=0;i<this.matriz.length;i++){
		for(int j=0;j<this.matriz[i].length; j++){
			salida+=this.matriz[i][j]+" ";
		}
		salida+="\n";}	
	return salida;}

public Matriz producto(Matriz matriz2){
	Matriz matrizProducto=new Matriz(this.matriz.length,matriz2.matriz[0].length);
	for(int i=0;i<this.matriz.length;i++)
		for(int k=0;k<matriz2.matriz[0].length; k++)
			for(int j=0;j<matriz2.matriz.length; j++)
			{matrizProducto.matriz[i][k]+=this.matriz[i][j]*matriz2.matriz[i][k];}
return matrizProducto;
}
public Matriz(int f, int c) {
	
	this.matriz = new int[f][c];
}

public Matriz prodEscalar(int n){
	Matriz prod=new Matriz (this.matriz.length,this.matriz.length);
	for(int i=0;i<this.matriz.length;i++){
		for(int j=0;j<this.matriz.length; j++){
			prod.matriz [i][j]=n*this.matriz[i][j];}return prod;}
	
	public Matriz resMatrices (Matriz matriz2){
		
	Matriz resta=new Matriz(this.matriz.length,matriz[0].length)		
	for(int i=0;i<this.matriz.length;i++){
		for(int j=0;j<this.matriz.length; j++){
			resta.matriz [i][j]=this.matriz[i][j]-matriz2.matriz[i][j];}}
		return resta;}
		
	
}


}
