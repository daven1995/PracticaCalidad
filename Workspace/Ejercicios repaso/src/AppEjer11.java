import javax.swing.JOptionPane;


public class AppEjer11 {

	public static void main(String[] args) {
		Ejercicio1 matriz= new Ejercicio1();
		String salida="";
		
		matriz.setfibonacci();
		for(int i=2;i<100;i++){
		salida+=Integer.parseInt(matriz[i])+"";	
		}

	}

}
