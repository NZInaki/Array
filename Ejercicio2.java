
public class Ejercicio2 {

	public static void main(String[] args) {
int tabla[]= {3,6,2,77,3,10,23,14,11,7};
		
		int Mitad1 = 0;
		int Mitad2 = 0;
		
		//"i" es un contador para que Mitad1 sólo sume la primera mitad de la tabla.
		for (int i = 0; i< (tabla.length/2); i++) 
			Mitad1 = Mitad1 + tabla [i];
		
		System.out.println("La suma de la primera mitad es: " + Mitad1);
		
		//Aquí Mitad2 empieza a sumar desde la mitad de la tabla, y sigue sumando hasta llegar al final de la tabla.
		for (int i =(tabla.length/2); i< tabla.length; i++ )
			Mitad2 = Mitad2 + tabla [i];
		
		System.out.println("La suma de la segunda mitad es: " + Mitad2);
		
		//Comprueba qué mitad suma un número mayor.
		if (Mitad1>Mitad2)
			System.out.println ("La suma de la primera mitad es mayor que la suma de la segunda");
		else if (Mitad1<Mitad2)
			System.out.println ("La suma de la segunda mitad es mayor que la suma de la primera");
		else
			System.out.println ("La primera mitad de la tabla y la segunda mitad suman la misma cantidad");
		//también sirve para tablas que tengan una cantidad de números divisible entre 2.
	}
}