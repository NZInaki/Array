
public class ArrayNum4 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		
//guarda el último número
		int a = tabla [tabla.length-1];
		
		//cambia el número actual en la posicion de la derecha por el que tiene a su izquierda, y va haciendo lo mismo hacia la izquierda
			for (int i = tabla.length-1; i > 0; i--) {
		        tabla[i] = tabla[i - 1];}
			
			//cambia el primer número por el que había en última posición al principio
			tabla[0] = a;
			
			System.out.println (tabla[0] + "," + tabla[1] + "," + tabla[2] + "," + tabla[3] + "," + tabla[4] + "," + tabla[5] + "," + tabla[6] + "," + tabla[7] );
			
	}
}