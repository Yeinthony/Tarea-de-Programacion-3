
public class UsarAuto {

	public static void main(String[] args) {

		Auto Auto1 = new Auto(); // Instancia de la clase Auto
		
		Auto1.EstablecerColor("Negro"); // Llamado al metodo EstablecerColor de la clase auto
		Auto1.EstablecerModelo("Ferrari F12 Berlinetta");// Llamado al metodo EstablecerModelo de la clase auto
		Auto1.EstablecerMotor("V12 de 6.3 litros");// Llamado al metodo EstablecerMotor de la clase auto
		
		System.out.println(Auto1.Datos_Generales()+Auto1.DameModelo()+Auto1.DameColor()+Auto1.DameMotor()); //Se muestras los datos por consola

	}

}


