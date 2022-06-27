package sprint01DesafioConversorJava;

import javax.swing.JOptionPane;


public class ConversorTemperatura  extends Conversor{

	
	public String selectTipoConversion() {
		this.tipoConversion = (JOptionPane.showInputDialog(null,"Elija la escala a la que desea convertir su temperatura","Temperaturas", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						  "De Celcius a Fahrenheit",
						  "De Celcius a Kelvin",
						  "De Fahrenheit a Celcius",
						  "De Fahrenheit a Kelvin",
						  "De Kelvin a Celcius",
						  "De Kelvin a Fahrenheit",
				  },"De Celcius a Fahrenheit")).toString();
		return tipoConversion;
	}
	
public double calculoConversion(String tipoConvercion, double cantidad) {
		
		switch (tipoConversion) {
		case "De Celcius a Fahrenheit":
			cantidad =  (cantidad * 9/5) + 32 ;
			
			break;
			
		case "De Celcius a Kelvin":
			cantidad = cantidad + 273.15 ;
			
			break;
			
		case "De Fahrenheit a Celcius":
			cantidad = (cantidad - 32) * 5/9;
			
			break;
			
		case "De Fahrenheit a Kelvin":
			cantidad = (cantidad - 32) * 5/9 + 273.15;
			
			break;
			
		case "De Kelvin a Celcius":
			cantidad = cantidad - 273.15;
			
			break;
			
		case "De Kelvin a Fahrenheit":
			cantidad = (cantidad - 273.15) * 9/5 + 32;
			
			break;

		default:
			break;
		}
		return cantidad;
		
	}
}
