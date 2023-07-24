package Conversorlongitud;

import javax.swing.JOptionPane;

public class Opcionesconversionlongitud {
	
Convertirlongitud longitud = new Convertirlongitud();
	
	
	public void Convertirlongitud(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la Longitud que quieras Convertir ",  "Longitud",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Kilometro a Metro", "De Kilometro a Decimetro", "De Kilometro a Centimetro", "De Kilometro a Milimetro", 
							"De Metro a Kilometro", "De Metro a Decimetro", "De Metro a Centimetro", "De Metro a Milimetro",
							"De Decimetro a Kilometro", "De Decimetro a Metro", "De Decimetro a Centimetro", "De Decimetro a Milimetro",
							"De Centimetro a Kilometro", "De Centimetro a Metro", "De Centimetro a Decimetro", "De Decimetro a Milimetro",
							"De Milimetro a Kilometro", "De Milimetro a Metro", "De Milimetro a Decimetro", "De Milimetro a Centimetro"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Kilometro a Metro":
		longitud.ConvertirKilometroMetro(valor);
		break;
	
	case "De Kilometro a Decimetro": 
		longitud.ConvertirKilometroDecimetro(valor);
		break;
		
	case "De Kilometro a Centimetro":
		longitud.ConvertirKilometroCentimetro(valor);
		break;
		
	case "De Kilometro a Milimetro":
		longitud.ConvertirKilometroMilimetro(valor);
		break;
		
	case "De Metro a Kilometro":
		longitud.ConvertirMetroKilometro(valor);
		break;
	
	case "De Metro a Decimetro":
		longitud.ConvertirMetroDecimetro(valor);
		break;
		
	case "De Metro a Centimetro":
		longitud.ConvertirMetroCentimetro(valor);
		break;
		
	case "De Metro a Milimetro":
		longitud.ConvertirMetroMilimetro(valor);
		break;
	 
	case "De Decimetro a Kilometro":
		longitud.ConvertirDecimetroKilometro(valor);
		break;
		
	case "De Decimetro a Metro":
		longitud.ConvertirDecimetroMetro(valor);
		break;
		
	case "De Decimetro a Centimetro":
		longitud.ConvertirDecimetroCentimetro(valor);
		break;
		
	case "De Decimetro a Milimetro":
		longitud.ConvertirDecimetroMilimetro(valor);
		break;
		
	case "De Centimetro a Kilometro":
		longitud.ConvertirCentimetroKilometro(valor);
		break;
		
	case "De Centimetro a Metro":
		longitud.ConvertirCentimetroMetro(valor);
		break;
		
	case "De Centimetro a Decimetro":
		longitud.ConvertirCentimetroDecimetro(valor);
		break;
		
	case "De Centimetro a Milimetro":
		longitud.ConvertirCentimetroMilimetro(valor);
		break;
	
	case "De Milimetro a Kilometro":
		longitud.ConvertirMilimetroKilometro(valor);
		break;
		
	case "De Milimetro a Metro":
		longitud.ConvertirMilimetroMetro(valor);
		break;
		
	case "De Milimetro a Decimetro":
		longitud.ConvertirMilimetroDecimetro(valor);
		break;
		
	case "De Milimetro a Centimetro":
		longitud.ConvertirMilimetroCentimetro(valor);
		break;	
		
	}
	}
	}
	


