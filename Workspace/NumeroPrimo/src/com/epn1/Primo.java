
package com.epn1;
public class Primo {
	private int x;

	public Primo() {
		super();
		this.x=0;
		}
	//sobrecarga de constructores
	public Primo(int x) {
		super();
		this.x = x;  //this refiere al objeto actual
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public boolean esPar()
	{
	return this.x%2==0;
		
	}
	public String toString()
	{
		return ("X="+ this.x);
	}
	
	public long sumaDigitos()
	{ int SR=0,R ,C;
	C=x;
	while (C!=0) {
	R=C%10;
	C=C/10;
	SR=SR+R;
	}
	return SR;
	}
	
	public boolean esPrimo()
	{ boolean bandera=true;
		for(int i=2;i<(this.x);i++){
		if(this.x%i==0){
			bandera=false;
			break;
		}
	}
	return bandera;	}
	
	public boolean esPerfecto()
	{ 
	int cont=0;
	int j;
		for(j=2;j<=x;j++)
		{
		if((this.x)%j==0)
			{
			cont = cont+(x/j);
			}
		}return (cont==this.x);	}
	
	public int Factorial(int x)
	{ 
			
		if (x==0) 
			return 1;
		else return (x*Factorial(x-1)); 
		
		}
	}

