package RepasosEnClases;

public class ExpresionesLogicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Evalúe las siguientes expresiones lógicas, y determine su valor de verdad. En este punto no debe
		usar ninguna ayuda tecnológica, solo las tablas de verdad indicadas en el material de apoyo.
		a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10))
		b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3))
		c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)
		Una vez que tenga la respuesta de todas ellas, traspáselas a un archivo nuevo de Java y verifique
		sus resultados. Para que el proceso sea transparente, en el pseudocódigo, a modo de comentario,
		debe indicar si contestó correctamente el caso indicado.
		*/
		
		//a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10)) 		Es verdadero porque se cumple la segunda.
		//b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3)) Es verdadero.
		//c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20) Es verdadero.
		// en el word pongo el desarrollo del ejercicio :D
		
		 
		 boolean v1 = (('A' > 'B') || ("hola mundo".length() == 10)) ;
		 System.out.println(v1);
		
		 
		 boolean v2 = !((5 + 2) < 7) && !((7 > 9) || (3 < 5) && (4 == 3));
		 System.out.println(v2);
		 
		
		 boolean v3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) || (10 - 5) < 20) ;
		 System.out.println(v3);
		 
	}

}
