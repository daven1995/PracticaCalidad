package com.epn1;
import javax.swing.JOptionPane; 
public class AplicacionPrimo {
	public static void main(String[] args) {
		String salida="";
		Primo numero= new Primo();
		int factorial;
		String Opcion2;
		int options2 = 0;
		int aux;
		do{aux=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un entero"));
		numero.setX(aux);
		String Opcion;
		int options = 0;
		 salida="";
		salida+=numero.toString()+"\n";
		do{
			Opcion=JOptionPane.showInputDialog("Digite el numero de la opcion que quiere realizar\n" +
					"1. Verifique la paridad del Número\n" +
					"2. Sume los digitos de su número\n" +
					"3. Verifique si su numero es primo\n" +
					"4. Verifique si su numero es perfecto\n" +
					"5. Saque el factorial de su numero\n" +
					"6. Salir al menu principal");
			options  = Integer.parseInt(Opcion);
					switch(options){
			case 0:
				break;
			case 1:
				if(numero.esPar())
					salida+="Es Par\n";
				else 
					salida+="Es Impar\n";		
				JOptionPane.showMessageDialog(null,salida);
				break;	
			case 2:
				salida+="La suma de digitos es "+numero.sumaDigitos()+"\n";
				JOptionPane.showMessageDialog(null,salida);
				break;
			case 3:
				salida+=((numero.esPrimo())?"El numero ingresado ES PRIMO\n":"El numero ingresado NO ES PRIMO\n")	;
				JOptionPane.showMessageDialog(null,salida);
				break;	
			case 4:
				salida+=((numero.esPerfecto())?"El numero ingresado ES PERFECTO\n":"El numero ingresado NO ES PERFECTO\n")	;
				JOptionPane.showMessageDialog(null,salida);
				break;	
			case 5:
				factorial=numero.Factorial(numero.getX());
				salida+="El factorial de su numero es: "+factorial+"\n"	;
				JOptionPane.showMessageDialog(null,salida);
				break;	
			case 6:
				Opcion2=JOptionPane.showInputDialog("Digite el numero de la opcion que quiere realizar\n" +
						"1. Ingresar otro numero\n" +
						"2. Salir completamente del programa\n");
				options2  = Integer.parseInt(Opcion2);
				JOptionPane.showMessageDialog(null,"Adios!");				
				break;
			default:JOptionPane.showMessageDialog(null, "Opcion No Valida");
			}	
		}while (options!=6&&options2!=2);
		}while (options2==1);
		}
}


