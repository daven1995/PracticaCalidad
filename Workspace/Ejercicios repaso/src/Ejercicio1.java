

public class Ejercicio1 {
private int [] fibonacci;

public Ejercicio1(){
fibonacci = new int [100];
}

public void setfibonacci(){
	fibonacci[0]=0;
	fibonacci[1]=1;
	for(int i=2;i<this.fibonacci.length;i++){
	fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];	
	}
}
}
