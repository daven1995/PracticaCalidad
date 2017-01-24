package com.epn5;

public class Aplicacion {

	public static void main(String[] args) {
		Matriz matrizA=new Matriz();
		Matriz matrizB=new Matriz();
		Matriz matrizC=new Matriz();
		Matriz matrizDis=new Matriz();
		matrizA.setMatriz();
		matrizB.setMatriz();
		matrizC.setMatriz();
		Matriz B2=matrizB.producto(matrizB);
		Matriz AC=matrizA.producto(matrizC);
		AC=AC.prodEscalar(4);
		matrizDis=B2.restaMatriz(AC);

	}

}
