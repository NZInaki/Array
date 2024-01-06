
public class ArrayNum10 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		int divisible=0;
		
		//Cada vez que el resto de la división entre un número de la tabla y el número siete es 0, suma 1 al contador.
		for (int i=0; i<tabla.length; i++)
		if (tabla[i] % 7==0) {
			divisible++;}
		System.out.println("Hay " + divisible + " valores divisibles entre 7.");
	}
}