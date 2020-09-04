package innleveringen;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg6 {

	public static void main(String[] args) {

		
		int fa = sum(parseInt(showInputDialog("skriv inn heltallsverdi:")));		
		
		showMessageDialog(null, fa);
	}
	
		public static int sum(int n) {	
		
		if (n<0) {
			showMessageDialog(null,"Ikke lov å ta negativetall");
		}
			
		if (n>0) {
		
		return n*sum(n-1); }
		
		else {return 1;}
		
		
		
		
	}					
}