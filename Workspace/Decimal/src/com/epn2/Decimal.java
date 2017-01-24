package com.epn2;
	public class Decimal {
		private double x;
		public Decimal() {
			super();
			this.x = 0;	}
		public Decimal(double x) {
			super();
			this.x = x;	}
		public double getX() {
			return x;	}
		public void setX(double x) {
			this.x = x;	}
		public String toString(){
			return "X = "+this.x;	}
		public int Entero(){
			int ent=(int) this.x;
			return ent;	}
		public float Decimal(int ent){
			float dec;
			dec=(float) (this.x - ent);
			return dec;	}
		
		public int Numerador(){
			float frac;
			int numerador;
			frac= (float) this.x;	
			do{	frac=frac*10;
			numerador=(int)frac;
				}while (frac!=numerador);
				return numerador;	}
		public int Denominador(float dec){
			int C,denominador=0;
			float frac;
			frac= (float) dec;	
			do{	frac=frac*10;
			C=(int)frac;
				}while (frac!=C);
			 do{	C=C/10;
				denominador=denominador+1;
			}while (C!=0);
			denominador=(int) Math.pow (10,denominador);
			return denominador;	}
		
		public int mcd( int denominador, int numerador)
		{	int d = denominador; 
			int n = numerador;
		     int r;
		      while(n!=0)
		     { r = d%n;
		          d = n;
		          n = r;
		     } return d;}
		
		public int Numerador2(int mcd, int numerador){
			int numsim=0;
			numsim=numerador/mcd;
			return numsim;		}
		public int Denominador2(int mcd, int denominador){
			int densim=0;
			densim=denominador/mcd;
			return densim;		}
		}

