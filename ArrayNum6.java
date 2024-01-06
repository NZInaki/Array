
public class ArrayNum6 {

	public static void main(String[] args) {
		int tabla[]= new int [20];
		
		int resultado = 1;
		tabla [1] = 1;
		
		//Calcula un número de la secuencia de Fibonacci, lo coloca, y pasa al siguiente.
		for (int i = 2; i <= 20; i++) {
			tabla [i] = resultado;
			resultado = resultado + i;}

		System.out.println (tabla);

	}
}