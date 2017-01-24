package com.epn;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vector {
private int [] vector;
public Vector ()
{int longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del Vector"));
vector =new int [longitud];

}
public int[] getVector() {
	return vector;
}
public void setVector() {
	Random npseudo =new Random();
	for (int i=0; i<this.vector.length;i++)
	{//vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Vector["+i+"]="));	
	this.vector[i]=1+npseudo.nextInt(6);
	}}
public String toString ()
{String salida="";
for (int i=0; i<this.vector.length;i++)
salida+=vector[i]+" ";
return salida;
}
public long sumatorio()
{long sumatorio=0;
for (int i=0; i<this.vector.length;i++)
{sumatorio=sumatorio+vector[i];
}
return sumatorio;
}

public long sumapar()
{long sumapar=0;
for (int i=0; i<this.vector.length;i++)
{if (vector[i]%2==0)
	sumapar=sumapar+vector[i];}
return sumapar;
}
public boolean esPrimo(int x)
{ 
	int contador = 0;
	for(int i=x;i>0;i--){
	if(x%i==0)
	{
		contador++;
	}
}
return (contador==2);
		}

public long sumaprimo()
{
long sumaprimo=0;
for (int i=0; i<this.vector.length;i++)
	if (Vector.this.esPrimo(this.vector[i]))
				{
		sumaprimo+=vector[i];
				}
return sumaprimo;
}

public int Primos()
{
int primos=0,j=0;

for (int i=0;i<vector.length;i++){
   if(Vector.this.esPrimo(vector[i]))
   {
    primos++;
    this.vector[j]=this.vector[i];
    j++;
    }
}
return primos;}

public void desorden()  
{ int [] desorden=vector;
  }
public void sortBurbuja()  
{  int auxiliar;  
int [] ordenado=vector;
  for(int i = 0; i < ordenado.length-1; i++)  
  {for(int j =i+1;j < ordenado.length;j++)  
    {if(ordenado[i] > ordenado[j])  
      {auxiliar = ordenado[j];  
        ordenado[j] = ordenado[i];  
        ordenado[i] = auxiliar;;}}}}


public int busquedaSecuencial(int b)  
{int i;
int posicion=-1;
for( i= 0; i < vector.length; i++)  {
if(vector[i]==b)
{posicion=i;break;}}
return posicion;}

public int busquedaBinaria(int b)  
{int min=0,medio=0;
int max=vector.length-1;
	 while(min <= max)
     {   medio = (max + min) / 2;
          
           if (vector[medio] == b)
              return medio;
           else
              if (vector[medio] > b)
                    max = medio - 1;
              else
                    min = medio + 1;
     }return -1;}

public void sortDes()  
{  int auxiliar;  
int [] ordenadodes=vector;
  for(int i = 0; i < ordenadodes.length-1; i++)  
  {for(int j =i+1;j < ordenadodes.length;j++)  
    {if(ordenadodes[i] < ordenadodes[j])  
      {auxiliar = ordenadodes[j];  
        ordenadodes[j] = ordenadodes[i];  
        ordenadodes[i] = auxiliar;;}}}}



public int busquedaBinariades(int b)  
{int med=0, min = 0, max = this.vector.length-1;
     while(min<=max)
     {
    	 med = (min+max)/2;
         if( b == vector[med])
           return med;
         else
        	 if( b < vector[med] )
        		 min = med+1;
       else
                max = med-1;
     }return -1;
}
public int Pares()
{int pares=0;
   for (int i=0;i<vector.length;i++){
       if(vector[i]%2==0){
    	   
         pares=pares+1; }

}
   return pares;
}

public int contPrimos()
{
	int primos=0,j=0;

   for (int i=0;i<vector.length;i++){
       if(Vector.this.esPrimo(vector[i]))
       {
        primos++;
        this.vector[j]=this.vector[i];
        j++;
        }
   }
   return primos;
}

public int Mayor(){
	 int auxiliar;  
	 int [] ordenado=vector;
	 int j=0;
	   for(int i = 0; i < ordenado.length-1; i++)  
	   {for(j =i+1;j < ordenado.length;j++)  
	     {if(ordenado[i] > ordenado[j])  
	       {auxiliar = ordenado[j];  
	         ordenado[j] = ordenado[i];  
	         ordenado[i] = auxiliar;;}}}
	   return ordenado[j];}

public int Menor(){
	 int auxiliar;  
	 int [] ordenado=vector;
	 int j=0;
	   for(int i = 0; i < ordenado.length-1; i++)  
	   {for(j =i+1;j < ordenado.length;j++)  
	     {if(ordenado[i] > ordenado[j])  
	       {auxiliar = ordenado[j];  
	         ordenado[j] = ordenado[i];  
	         ordenado[i] = auxiliar;;}}}
	   return ordenado[0];}}
