class CAritmetica
{
	/*
	 * Operaciones aritméticas
	 */
	public static void main(String[] args) {
		int dato1, dato2, dato3, resultado;

		dato1 = 20;
		dato2 = 10;
		dato3 = 5;

		// Suma
		resultado = dato1 + dato2 + dato3;
		System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);

		// Resta
		resultado = dato1 - dato2 - dato3;
		System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);

		// Producto
		resultado = dato1 * dato2 * dato3;
		System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);

		// Cociente
		resultado = dato1 / dato2;
		System.out.println(dato1 + " / " + dato2 + " = " + resultado);	
	}	
}