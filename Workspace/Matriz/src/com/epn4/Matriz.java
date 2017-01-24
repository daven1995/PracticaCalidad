package com.epn4;

import java.util.Random;
import javax.swing.JOptionPane;
public class Matriz {
private int [][] matriz;

public Matriz(){
	int filas, columnas;
	filas=Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de filas"));
	columnas=Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de columnas"));
	matriz=new int [filas][columnas];}

public Matriz(int f, int c) {
	matriz = new int [f][c];}

public void setMatriz(){
	Random npseudo=new Random();
	for(int i=0;i<this.matriz.length;i++){
		for(int j=0;j<this.matriz[i].length; j++){
			this.matriz[i][j]=1+npseudo.nextInt(5);}}}
	
	public Matriz producto(Matriz matriz2){
		Matriz matrizProducto=new Matriz(this.matriz.length,matriz2.matriz[0].length);
		for(int i=0;i<this.matriz.length;i++)
			for(int k=0;k<matriz2.matriz[0].length; k++)
				for(int j=0;j<matriz2.matriz.length; j++)
				{matrizProducto.matriz[i][k]+=this.matriz[i][j]*matriz2.matriz[j][k];}
	return matrizProducto;}


public String toString() {
	String salida="";
	for(int i=0;i<this.matriz.length;i++){
		for(int j=0;j<this.matriz[i].length; j++){
			salida+=this.matriz[i][j]+" ";}
		salida+="\n";}	
	return salida;}

public int diagonal() {
	int sumadia=0;
	for(int i=0;i<this.matriz.length;i++){sumadia+=matriz[i][i];
		}return sumadia;}

public int diagonalinversa() {
	int sumad=0,j=0;
	for(int i=this.matriz.length-1;i>=0;i--){
		sumad+=this.matriz[i][j];
		j+=1;}
		return sumad;}

public Matriz sumaMatriz(Matriz matriz2){
	Matriz matrizSuma=new Matriz(this.matriz.length,this.matriz[0].length);
	for(int i=0;i<this.matriz.length;i++){
		for(int j=0;j<this.matriz[i].length; j++){
			matrizSuma.matriz[i][j]=this.matriz[i][j]+matriz2.matriz[i][j];}}
		return matrizSuma;}}
