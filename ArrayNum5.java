
public class ArrayNum5 {
public static void main(String[] args) {
	int tabla[]= new int [10];
		
			int resultado = 1;
			tabla [1] = 1;
			
			//Calcula un factorial, lo coloca, y pasa al siguiente.
			for (int i = 2; i <= 10; i++) {
				tabla [i] = resultado;
				resultado = resultado * i;}
	}
}