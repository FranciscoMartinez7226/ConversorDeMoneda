package conversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {
	
ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	
	public void ConvertirTemperaturas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elija la Escala a la que quiera Convertir ",  "Escalas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"Celsius a Fahrenheit" , "Celsius a Kelvin" , "Fahrenheit a Celsius" , 
					"Fahrenheit a Kelvin" , "Kelvin a Celsius" , "Kelvin a Fahrenheit", }, 
					"Seleccion")).toString();
	
	switch (opcion) {
	
	case "Celsius a Fahrenheit":
		temperatura.ConvertirCelsiusFahrenheit(valor);
		break;
		
	case "Celsius a Kelvin": 
		temperatura.ConvertirCelisusKelvin(valor);
		break;
		
	case "Fahrenheit a Celsius":
		temperatura.ConvertirFahrenheitCelsius(valor);
		break;
		
	case "Fahrenheit a Kelvin":
		temperatura.ConvertirFahrenheitKelvin(valor);
		break;
		
	case "Kelvin a Celsius":
		temperatura.ConvertirKelvinCelsius(valor);
		break;
		
	case "Kelvin a Fahrenheit":
		temperatura.ConvertirKelvinFahrenheit(valor);
		break;

}
}
}