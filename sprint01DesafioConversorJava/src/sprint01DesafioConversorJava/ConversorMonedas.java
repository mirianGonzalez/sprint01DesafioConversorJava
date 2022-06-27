package sprint01DesafioConversorJava;

import javax.swing.JOptionPane;

public class ConversorMonedas extends Conversor {

	
	private String tipoConversion;

	
	
	public String selectTipoConversion() {
		this.tipoConversion = (JOptionPane.showInputDialog(null,"Elija la moneda a la que desea convertir su dinero","Monedas", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						  "De Peso argentino a Dólar americano US$",
						  "De Peso argentino a Euro € ",
						  "De Peso argentino a Libra esterlina £",
						  "De Peso argentino a Real brasileño R$",
						  "De Peso argentino a Guaraní paraguayo ₲",
						  "De Dólar americano US$ a Peso argentino",
						  "De Euro € a Peso argentino",
						  "De Libra £ a Peso argentino",
						  "De Real brasileño R$ a Peso argentino",
						  "De Guaraní paraguayo ₲ a Peso argentino",
				  },"De peso argentino a Dólar americano")).toString();
		return tipoConversion;
	}
	
	public double calculoConversion(String tipoConvercion, double cantidad) {
		
		switch (tipoConversion) {
		case "De Peso argentino a Dólar americano US$":
			cantidad = cantidad / 122.85;
			
			break;
			
		case "De Peso argentino a Euro €":
			cantidad = cantidad / 128.78;
			
			break;
			
		case "De Peso argentino a Libra esterlina £":
			cantidad = cantidad / 151.20;
			
			break;
			
		case "De Peso argentino a Real brasileño R$":
			cantidad = cantidad / 47.60;
			
			break;
			
		case "De Peso argentino a Guaraní paraguayo ₲":
			cantidad = cantidad * 55.81;
			
			break;
			
		case "De Dólar americano US$ a Peso argentino":
			cantidad = cantidad * 122.85;
			
			break;
			
		case "De Euro € a Peso argentino":
			cantidad = cantidad * 128.78;
			
			break;
			
		case "De Libra esterlina £ a Peso argentino":
			cantidad = cantidad * 151.20;
			
			break;
			
		case "De Real brasileño R$ a Peso argentino":
			cantidad = cantidad * 42.00;
			
			break;
			
		case "De Guaraní paraguayo ₲ a Peso argentino":
			cantidad = cantidad / 55.81;
			
			break;
			

		default:
			break;
		}
		return cantidad;
		
	}
	

}
