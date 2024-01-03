
public class ArrayNum3 {

	public static void main(String[] args) {
int tabla[]= {3,6,2,77,3,10,23,14};
		
		boolean repetido = false;
		//compara el primer número con el resto, luego el segundo con los siguientes, después el tercero con los 5 restantes...
		for (int i = 0; i < 7; i++)
			for (int j = i+1 ; i < 8; i++)
				if (tabla[i] == tabla[j])
					repetido = true;
		
		if (repetido == true)
			System.out.println ("Un número se repite");
		else
			System.out.println ("No hay ningún número repetido");
	}
}