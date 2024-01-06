
public class ArrayNum11 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		int primos=0;
//Selecciona un número de la tabla, hace el siguiente proceso y luego pasa al siguiente número de la tabla.
		for (int i=0; i<tabla.length; i++) {
				int contador=0;
//Cada número desde el 2 hasta el anterior a número de la tabla seleccionado que dividido entre el número de la tabla, de un resto de 0, suma 1 al contador.
			for (int a=2; a<tabla[i]; a++) {
		        if (tabla[i] % a== 0) {
		            contador++;}
			}
			//Si el contador está en 0, significa que ningún número entre el 2 y el anterior al número de la tabla ha dado un resto de 0, así que suma 1 al contador de números primos.
			if (contador==0) {
				primos++;}
			
		}
		System.out.println("Hay " + primos + " números primos.");
	}
}