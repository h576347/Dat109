package no.hvl.dat109.tekster;

import no.hvl.dat109.Gruppe;

public class BilGruppeTekst {
	
	private Gruppe gruppe;
	
	public void bilGruppe() {
		
	}
	
	

	
	public void bilGruppeTekst() {
		System.out.println("Trykk på tast fra 1 til 4 for å velge bilgruppe: " + 
				"\n" + "1) Gruppe A" 
				+"\n" + "2) Gruppe B"
				+"\n" + "3) Gruppe C"
				+"\n" + "4) Gruppe D");
		
	}

	
	public Gruppe gruppe(int valg) {
		Gruppe g = bilGruppe(valg);
		return g;
	}
	
	
	private Gruppe bilGruppe(int valg) {
		
		Gruppe g = null;
		
		switch(valg) {
		
			case 1 : g = Gruppe.A;
			break;
			
			case 2 : g = Gruppe.B;
			break;
			
			case 3 : g = Gruppe.C;
			break;
			
			case 4 : g = Gruppe.D;
			break;
			
		}
		
		return g;
	}
}
