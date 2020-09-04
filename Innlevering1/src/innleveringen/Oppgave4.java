package innleveringen;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4 {

	public static void main(String[] args) {
					
		int a = 164100;
		int b = 230950;
		int c = 580650;
		int d = 934050;
		int e = 0;
		double f = 0.0093;
		double g = 0.0241;
		double h = 0.1152;
		double i = 0.1452;
						 
			int inn = parseInt(showInputDialog("Inntekt:"));	
			
			//runder av til nærmeste krone, for å kutte tall etter "," tegn. Tallet ble evigt langt
			
			if(inn >= 0 && inn <= a)
			showMessageDialog(null,"skatt: " + Math.round(inn*e));
			
			else if(inn > a && inn <= b) 
			showMessageDialog(null,"skatt:" + Math.round(inn*f));
			
			else if(inn > b && inn <= c) 
			showMessageDialog(null,"skatt:" + Math.round(inn*g));
			
			
			else if (inn > c && inn <= d) 
			showMessageDialog(null,"skatt:" + Math.round(inn*h));
			
			else if(inn > d) 
			showMessageDialog(null,"skatt:" + Math.round(inn*i));
			
			else if (inn < 0) {
			showMessageDialog(null,"Ikke gyldig");
			}
			}
		}