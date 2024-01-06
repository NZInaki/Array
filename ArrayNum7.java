
public class ArrayNum7 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		int impar=0;
		int par=0;
		
		//Comprueba los números de uno en uno; si es par, suma 1 a la variable par, si no, suma 1 a la variable impar.
		for (int i=0; i<tabla.length; i++)
			if (tabla[i] % 2==0)
			par++;
			else
			impar++;
		
		if (impar>par)
			System.out.println ("Hay más impares que pares.");
		else if (impar==par)
			System.out.println("Hay tantos impares como pares.");
		else
			System.out.println ("Hay más pares que impares.");
	}
}