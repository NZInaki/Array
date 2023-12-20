
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tabla[]= {3,6,2,77,3,10,23,14};
		
		int cantidad = 0;
		
		for ( int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 3) 
				cantidad ++;
		}
				System.out.println ("Hay " + cantidad + " números 3 en la tabla");
	}
}