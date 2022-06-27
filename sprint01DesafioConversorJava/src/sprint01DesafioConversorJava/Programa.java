package sprint01DesafioConversorJava;

import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[] args) {
		Conversor monedas = new ConversorMonedas();
		Conversor temperatura = new ConversorTemperatura();
		
		
		ejecutarPrograma( monedas, temperatura);
	
				
	}
	
public static void ejecutarPrograma( Conversor monedas, Conversor temperatura) {
		
		String userInput = (JOptionPane.showInputDialog(null,"Selecciona una option de convercion","Menu", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de monedas", "Conversor de temperatura"},"Conversor de monedas")).toString();
		
		if(userInput == "Conversor de monedas") {
			
			String input = JOptionPane.showInputDialog("Ingresa la cantidad de Dinero que deseas convertir");
			String tipoConv = monedas.selectTipoConversion();
			double total = monedas.calculoConversion(tipoConv, monedas.cantidad(input));
			
			String[] text = tipoConv.split("\\s+");
			String msg = text[text.length - 1];
			
			JOptionPane.showMessageDialog(null, "Tienes $ " + Math.round(total * 1) / 1d + " " + msg);
			
		} else if(userInput == "Conversor de temperatura") {
			String input = JOptionPane.showInputDialog("Ingresa la cantidad de Temperatura que deseas convertir");
			String tipoConv = temperatura.selectTipoConversion();
			double total = temperatura.calculoConversion(tipoConv, temperatura.cantidad(input));
			
			String[] text = tipoConv.split("\\s+");
			String msg = text[text.length - 1];
			
			JOptionPane.showMessageDialog(null, "Tienes " + Math.round(total) + " grados " + msg);
		}
		int continuar = JOptionPane.showConfirmDialog(null, "Deseas continuar?","Select", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(continuar == 0) {
			ejecutarPrograma( monedas, temperatura);
		} else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
		}
	}
}
