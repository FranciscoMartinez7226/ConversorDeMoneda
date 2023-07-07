package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void ConvertirPesosMexicanoDolares(double valor) {
		double monedaDolar = valor * 0.058;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaDolar + " Dolares Estadounidenses");
	}
	public void ConvertirPesosMexicanoEuros(double valor) {
		double monedaEuro = valor * 0.053;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaEuro + " Euros");
	}
	public void ConvertirPesosMexicanoLibra(double valor) {
		double monedaLibra = valor * 0.046;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesosMexicanoYen(double valor) {
		double monedaYen = valor * 8.30;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaYen + " Yenes");
	}
	public void ConvertirPesosMexicanoWon(double valor) {
		double monedaWon = valor * 75.90;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaWon + " Wones");
	}
	
	
	public void ConvertirDolaresPesosMexicano(double valor) {
		double monedaDolar = valor * 17.12;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaDolar + " pesos mexicanos");
	}
	public void ConvertirEurosPesosMexicano(double valor) {
		double monedaEuro = valor * 18.74;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaEuro + " pesos mexicanos");
	}
	public void ConvertirLibraPesosMexicano(double valor) {
		double monedaLibra = valor * 21.95;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaLibra + " pesos mexicanos");
	}
	public void ConvertirYenPesosMexicano(double valor) {
		double monedaYen = valor * 0.12;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaYen + " pesos mexicanos");
	}
	public void ConvertirWonPesosMexicano(double valor) {
		double monedaWon = valor * 0.013;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, monedaWon + " pesos mexicanos");
	}


}
