package Principal;

import javax.swing.*;

import Conversormonedas.Opcionesconversion;
import Conversortemperaturas.Opcionesconversiontemperatura;
import Conversorlongitud.Opcionesconversionlongitud;

public class Principal {

	public static void main(String[] args) {
		
		Opcionesconversion conversion = new Opcionesconversion();
		Opcionesconversiontemperatura conversionT = new Opcionesconversiontemperatura();
		Opcionesconversionlongitud conversionL = new Opcionesconversionlongitud();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Longitud", "Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.Convertirmonedas(valorRecibido);
				
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.Convertirtemperaturas(valorRecibidoT);
				
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
				
			case "Conversor de Longitud":
				String input2 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoL = Double.parseDouble(input2);
				conversionL.Convertirlongitud(valorRecibidoL);
				
				
				int respuestaL = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaL) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				
				
			}
			break;
		}
		
	}
		
	}