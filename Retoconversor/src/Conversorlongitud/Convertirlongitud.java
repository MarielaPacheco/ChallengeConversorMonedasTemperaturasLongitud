package Conversorlongitud;

import javax.swing.JOptionPane;

public class Convertirlongitud {
	
	public void ConvertirKilometroMetro(double valor) {
		double KMetro = valor * 1000;
		KMetro = (double)Math.round(KMetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KMetro + " Metro");
	}
	public void ConvertirKilometroDecimetro(double valor) {
		double KDecimetro = (valor * 10000);
		KDecimetro = (double)Math.round(KDecimetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KDecimetro + " Decimetro");
	}
	public void ConvertirKilometroCentimetro(double valor) {
		double KCentimetro = valor * 100000;
		KCentimetro = (double)Math.round(KCentimetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KCentimetro + " Centimetro");
	}
	public void ConvertirKilometroMilimetro(double valor) {
		double KMilimetro = valor * 1e+6;
		KMilimetro = (double)Math.round(KMilimetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KMilimetro + " Milimetro");
	}
	
	
	public void ConvertirMetroKilometro(double valor) {
		double MKilometro = valor/1000;
		MKilometro = (double)Math.round(MKilometro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + MKilometro + " Kilometro");
	}
	public void ConvertirMetroDecimetro(double valor) {
		double MDecimetro = valor *10;
		MDecimetro = (double)Math.round(MDecimetro  * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + MDecimetro + " Decimetro");
	}
	public void ConvertirMetroCentimetro(double valor) {
		double MCentimetro = valor *100;
		MCentimetro = (double)Math.round(MCentimetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + MCentimetro + " Centimetro");
	}
	public void ConvertirMetroMilimetro(double valor) {
		double MMilimetro = valor*1000 ;
		MMilimetro = (double)Math.round(MMilimetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + MMilimetro + " Milimetro");
	}
	
	
	public void ConvertirDecimetroKilometro(double valor) {
		double Dkilometro = valor/10000;
		Dkilometro = (double)Math.round(Dkilometro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + Dkilometro + " Kilometro");
	}
	public void ConvertirDecimetroMetro(double valor) {
		double DMetro = valor /10 ;
		DMetro = (double)Math.round(DMetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + DMetro + " Metro");
	}
	public void ConvertirDecimetroCentimetro(double valor) {
		double DCentimetro = valor *10 ;
		DCentimetro  = (double)Math.round(DCentimetro  * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + DCentimetro  + " Centimetro");
	}
	public void ConvertirDecimetroMilimetro(double valor) {
		double DMilimetro = valor * 100;
		DMilimetro  = (double)Math.round(DMilimetro  * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + DMilimetro  + " Centimetro");
	}
	
	
	
	public void ConvertirCentimetroKilometro(double valor) {
		double CKilometro = valor /100000;
		CKilometro = (double)Math.round(CKilometro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CKilometro + " Kilometro");
	}
	public void ConvertirCentimetroMetro(double valor) {
		double CMetro = valor /100;
		CMetro = (double)Math.round(CMetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CMetro + " Metro");
	}
	public void ConvertirCentimetroDecimetro(double valor) {
		double CDecimetro = valor /10;
		CDecimetro = (double)Math.round(CDecimetro* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CDecimetro + " Decimetro");
	}
	public void ConvertirCentimetroMilimetro(double valor) {
		double CMilimetro = valor * 10;
		CMilimetro = (double)Math.round(CMilimetro* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CMilimetro + " Milimetro");
	}
	
	
	public void ConvertirMilimetroKilometro(double valor) {
		double IKilometro = valor /1e+6 ;
		IKilometro = (double)Math.round(IKilometro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + IKilometro + " Kilometro");
	}
	public void ConvertirMilimetroMetro(double valor) {
		double IMetro = valor /1000;
		IMetro = (double)Math.round(IMetro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + IMetro + " Metro");
	}
	public void ConvertirMilimetroDecimetro(double valor) {
		double IDecimetro = valor /100;
		IDecimetro = (double)Math.round(IDecimetro* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + IDecimetro + " Decimetro");
	}
	public void ConvertirMilimetroCentimetro(double valor) {
		double ICentimetro = valor /10;
		ICentimetro = (double)Math.round(ICentimetro* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + ICentimetro + " Centimetro");
	}


}
