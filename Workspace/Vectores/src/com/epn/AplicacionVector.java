package com.epn;

import javax.swing.JOptionPane;

public class AplicacionVector {
	public  static void main(String[] args) {
		String salida="";
		Vector vector=new Vector();
		vector.setVector();
		salida+="El vector es : "+vector;
		salida+="\nLa suma de las entradas es = "+vector.sumatorio();
		salida+="\nLa suma de los pares es = "+vector.sumapar();	
		salida+="\nLa suma de los numeros primos es = "+vector.sumaprimo();
		JOptionPane.showMessageDialog(null, salida);
		
		vector.desorden();
		int elemsec=Integer.parseInt(JOptionPane.showInputDialog("El vector original "
				+ "es : "+vector.toString() + "\n     * * BUSQUEDA SECUENCIAL * *\nEscriba un numero para buscar"));
			if((vector.busquedaSecuencial(elemsec))==-1)JOptionPane.showMessageDialog(null, "El vector es : "+vector + "\n * * BUSQUEDA SECUENCIAL * *\nEl numero ingresado no se encuentra\n");
			else{JOptionPane.showMessageDialog(null, "El vector "
				+ "es : "+vector.toString()+ "\n     * * BUSQUEDA SECUENCIAL * *\n"
						+ "El elemento existe en la posicion "+vector.busquedaSecuencial(elemsec)+" y es el"
								+ " "+elemsec);} 
			vector.sortBurbuja();
		int elembin=Integer.parseInt(JOptionPane.showInputDialog(  "El vector ordenado ascendentemente "
				+ "es : \n      "+vector.toString() + "\n     * * BUSQUEDA BINARIA * *\nEscriba un numero para buscar"));
			if((vector.busquedaBinaria(elembin))==-1)JOptionPane.showMessageDialog(null, "El vector original "
					+ "es : "+vector.toString() + "\n       * * BUSQUEDA BINARIA * *\nEl numero ingresado no se encuentra\n");
			else{JOptionPane.showMessageDialog(null, "El vector original "
					+ "es : "+vector.toString() + "\n       * * BUSQUEDA BINARIA * *\nEl elemento existe en la posicion "+vector.busquedaBinaria(elembin)+" y es el "+elembin);} 
		vector.sortDes();
		int elembindes=Integer.parseInt(JOptionPane.showInputDialog(" BUSQUEDA BINARIA DESCENDENTE \nDigite el número a buscar:"));
	if((vector.busquedaBinariades(elembindes))==-1)JOptionPane.showMessageDialog(null, " BUSQUEDA BINARIA \nNúmero digitado no encontrado\n");
	else{JOptionPane.showMessageDialog(null, " BUSQUEDA BINARIA DESCENDENTE\nElemento encontrado en posición: "+vector.busquedaBinaria(elembindes)+" y es  "+elembindes);} 
	salida+="\nEl numero de elementos pares del vector es: "+vector.Pares();
	salida+="\nEl numero de elementos primos del vector es: "+vector.Primos();
	salida+="\nNúmero mayor es: "+vector.Mayor();
	salida+="\nNúmero menor es: "+vector.Menor();
	JOptionPane.showMessageDialog(null, salida);
	}
	}