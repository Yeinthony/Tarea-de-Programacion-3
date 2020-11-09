
public class Auto {
	// Cararacteristicas de la calse auto

	private int ruedas;
	private String motor;
	private String color;
	private String modelo;
	
	public Auto(){ruedas = 4;} //Constructor de la clase auto
	
	public String Datos_Generales (){return "El auto tiene "+ruedas+" ruedas. ";} //Getter que devuelve la caracteristica comun de la clase auto	
	
	public void EstablecerModelo(String Modelo) {modelo = Modelo;} // Setter que establece el modelo
	
	public String DameModelo () {return "Modelo "+ modelo;} // Getter que devuelve el modelo
	
	public void EstablecerColor(String Color) {color = Color;} // Setter que establece el color
	
	public String DameColor () {return ", de color "+ color;} // Getter que devuelve el color
	
	public void EstablecerMotor(String Motor) {motor = Motor;} // Setter que establece el motor
	
	public String DameMotor () {return " y con un motor "+ motor;} // Getter que devuelve el motor
	
}
