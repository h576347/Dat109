package no.hvl.dat109.tekster;

import java.util.Scanner;

import no.hvl.dat109.Bil;
import no.hvl.dat109.Farge;
import no.hvl.dat109.Gruppe;

public class BilTekst {
	
	private BilGruppeTekst bgTekst;
	
	public Bil nyBil() {
		Scanner tast = new Scanner(System.in);
		System.out.println("Skriv inn registreringsnummer: ");
		String regNr = tast.nextLine();
		
		System.out.println("Skriv inn bilmodell: ");
		String bilmodell = tast.nextLine();
		
		System.out.println("Skriv inn bilmerke: ");
		String bMerke = tast.nextLine();
		
		fargeTekst();
		int tall_1 = tast.nextInt();
		tast.nextLine();
		Farge bFarge = fargeValg(tall_1);
		
		bgTekst.bilGruppeTekst();
		int tall_2 = tast.nextInt();
		tast.nextLine();
		Gruppe bGruppe = bgTekst.gruppe(tall_2);
		
		int km = 0;
		
		tast.close();
		
		return new Bil(regNr,bMerke, bilmodell, bFarge, bGruppe, true,km);
		
		
	}
	

	private void fargeTekst() {
		System.out.println("Trykk på tast fra 1 til 4 for å velge farge: " + 
				"\n" + "1) BLÅ" 
				+"\n" + "2) SVART"
				+"\n" + "3) HVIT"
				+"\n" + "4) RØD");
	}
	
	
	
	private Farge fargeValg(int valg) {
		Farge f = null;
		
		switch(valg) {
			case 1 : f = Farge.BLÅ;
			break;
			
			case 2 : f = Farge.SVART;
			break;
			
			case 3 : f = Farge.HVIT;
			break;
			
			case 4 : f = Farge.RØD;
			break;
			
		}
		
		
		return f;
	}

	
}
