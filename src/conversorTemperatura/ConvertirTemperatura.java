package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelsiusFahrenheit(double valor) {
	    double CelFah = (valor * 1.8) + 32;
	    CelFah = (double)Math.round(CelFah * 100d) /100 ;
	    JOptionPane.showMessageDialog(null, CelFah + " Fahrenheit");
	}
	public void ConvertirCelisusKelvin(double valor) {
		double CelKel = valor + 273.15;
		CelKel = (double)Math.round(CelKel * 100d) /100 ;
		JOptionPane.showMessageDialog(null, CelKel + " Kelvin");
	}
	
	public void ConvertirFahrenheitCelsius(double valor) {
		double FahCel = (valor - 32) * ( 0.556 );
		FahCel = (double)Math.round(FahCel * 100d) /100 ;
		JOptionPane.showMessageDialog(null, FahCel + " Celsius");
	}
	public void ConvertirFahrenheitKelvin(double valor) {
		double FahKel = (valor + 459.67)*(0.556);
		FahKel = (double)Math.round(FahKel * 100d) /100 ;
		JOptionPane.showMessageDialog(null, FahKel + " Kelvin");
	}
	
	public void ConvertirKelvinCelsius(double valor) {
		double KelCel = valor - 273.15;
		KelCel = (double)Math.round(KelCel * 100d) /100 ;
		JOptionPane.showMessageDialog(null, KelCel + " Celsius");
	}
	public void ConvertirKelvinFahrenheit(double valor) {
		double KelFah = ((valor - 273.15) * (1.8)) + 32;
		KelFah = (double)Math.round(KelFah * 100d) /100 ;
		JOptionPane.showMessageDialog(null, KelFah + " Fahrenheit");
	}
	
}
