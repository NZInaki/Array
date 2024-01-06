
public class ArrayNum8 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		//"posicionA" y "posicionB" sirven para elegir la posición en la tabla cuyo número tienen que copiar las variables "a" y "b".
		int posicionA=0;
		int posicionB=tabla.length-1;
		int contador=0;
		int capicua=0;
		
		//Si la cantidad de números que coinciden con el número posicionado simétricamente al otro lado de la mitad de la tabla, es igual a la mitad de la longitud de la tabla; es capicúa. 
		while (contador<tabla.length/2) {
			contador++;
			int a=tabla[posicionA];
			int b=tabla[posicionB];
			posicionA++;
			posicionB--;
			if (a==b)
			capicua++;
		}
		if (capicua==tabla.length/2)
			System.out.println ("Es la misma secuencia de números si se leen de izquierda a derecha que de derecha a izquierda.");
		else
			System.out.println ("No es la misma secuencia de números si se leen de izquierda a derecha que de derecha a izquierda.");
	}
}