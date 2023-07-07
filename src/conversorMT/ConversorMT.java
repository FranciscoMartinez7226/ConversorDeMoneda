package conversorMT;

import conversorMoneda.OpcionesConversionMoneda;
import conversorTemperatura.OpcionesConversionTemperatura;
import javax.swing.JOptionPane;

public class ConversorMT {

	public static void main(String[] args) {
		
		OpcionesConversionMoneda conversionM = new OpcionesConversionMoneda();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elegir").toString();
			
			switch(opciones) {
			
			case "Conversor de Moneda":
				
				boolean realizarOtraConversion = true;
				while (realizarOtraConversion) {
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversionM.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
				} else {
					JOptionPane.showMessageDialog(null, "Terminaste tu consulta");
					realizarOtraConversion = false;
				}
				}
				break;
			
			case "Conversor de Temperatura":
				
				boolean realizarOtraConversion1 = true;
				while (realizarOtraConversion1) {
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaT) {
				} else {
					JOptionPane.showMessageDialog(null, "Terminaste tu consulta");
					realizarOtraConversion1 = false;
				}
					
		}
		break;
	}
	
}
	
}
}


