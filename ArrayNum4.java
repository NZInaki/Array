
public class ArrayNum4 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		
//guarda el último número
		int a = tabla [tabla.length];
		
		//cambia el número actual en la posicion de la derecha por el que tiene a su izquierda, y va haciendo lo mismo hacia la izquierda
			for (int i = tabla.length; i > 2; i--) {
		        tabla[i] = tabla[i - 1];}
			
			//cambia el primer número por el que había en última posición al principio
			tabla[1] = a;
			
	}
}