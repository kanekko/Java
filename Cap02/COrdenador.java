class COrdenador
{
	String Marca;
	String Procesador;
	String Pantalla;
	boolean OrdenadorEncendido;
	boolean Presentación;

	void EncenderOrdenador()
	{
		if (OrdenadorEncendido == true) // si está encendido...
			System.out.println("El ordenado ya está encendido.");
		else // si no está encendido, encendelo.
		{
			OrdenadorEncendido = true;
			System.out.println("El ordenador se ha encendido.");
		}	
	}

	void Estado()
	{
		System.out.println("\nEstado del ordenador:" +
						   "\nMarca " + Marca +
						   "\nProcesador " + Procesador +
						   "\nPantalla " + Pantalla + "\n");
		if (OrdenadorEncendido == true) // si el ordenador está encendido...
			System.out.println("El ordenador está encendido.");
		else // si no está encendido...
			System.out.println("El ordenador está apagado.");  
	}
	
	void ApagarOrdenador()
	{
		if (OrdenadorEncendido == true) // si no está apagado, apagarlo.
		{
			OrdenadorEncendido = false;
			System.out.println("El ordenador se ha apagado.");			
		}			
		else // si está apagado...
		{
			System.out.println("El ordenador ya está apagado.");
		}
	}

	public static void main(String[] args) 
	{
		COrdenador MiOrdenador = new COrdenador();
		MiOrdenador.Marca = "Ast";
		MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		MiOrdenador.EncenderOrdenador();
		MiOrdenador.Estado();
		
		MiOrdenador.ApagarOrdenador();
		MiOrdenador.Estado();	
	}

}