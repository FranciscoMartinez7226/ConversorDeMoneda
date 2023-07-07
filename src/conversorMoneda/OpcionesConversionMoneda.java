package conversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversionMoneda {

ConvertirMoneda monedas = new ConvertirMoneda();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que desee convertir",  "Divisas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos Mexicanos a Dólares Estadounidenses", "De Pesos Mexicanos a Euros",
					"De Pesos Mexicanos a Libras Esterlinas","De Pesos Mexicanos a Yenes", "De Pesos Mexicanos a Wones",
					"De Dólares Estadounidenses a Pesos Mexicanos","De Euros a Pesos Mexicanos", 
					"De Libras Esterlinas a Pesos Mexicanos", "De Yenes a Pesos Mexicanos", "De Wones a Pesos Mexicanos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos Mexicanos a Dólares Estadounidenses": 
		monedas.ConvertirPesosMexicanoDolares(valor);
		break;
	
	case "De Pesos Mexicanos a Euros": 
		monedas.ConvertirPesosMexicanoEuros(valor);
		break;
		
	case "De Pesos Mexicanos a Libras Esterlinas":
		monedas.ConvertirPesosMexicanoLibra(valor);
		break;
		
	case "De Pesos Mexicanos a Yenes":
		monedas.ConvertirPesosMexicanoYen(valor);
		break;
		
	case "De Pesos Mexicanos a Wones":
		monedas.ConvertirPesosMexicanoWon(valor);
		break;
		
	
	case "De Dólares Estadounidenses a Pesos Mexicanos":
		monedas.ConvertirDolaresPesosMexicano(valor);
		break;
		
	case "De Euros a Pesos Mexicanos":
		monedas.ConvertirEurosPesosMexicano(valor);
		break;
		
	case "De Libras Esterlinas a Pesos Mexicanos":
		monedas.ConvertirLibraPesosMexicano(valor);
		break;
	 
	case "De Yenes a Pesos Mexicanos":
		monedas.ConvertirYenPesosMexicano(valor);
		break;
		
	case "De Wones a Pesos Mexicanos":
		monedas.ConvertirWonPesosMexicano(valor);
		break;
	}
	}

}

