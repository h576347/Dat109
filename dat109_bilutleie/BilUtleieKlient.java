package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BilUtleieKlient {
	private Farge farge;
	private Gruppe gruppe;
	private Bilutleiefirma bFirma;
	private Utleiekontor uk,uk1,uk2;
	private Addresse as, as1, as2, asFirma, asKunde;
	private Bil bil,bil1,bil2,bil3,bil4,bil5,bil6,bil7,bil8;
	private Reservasjon res;
	private Kunde kunde;
		
	
	public void settOppFirma() {
		bFirma = new Bilutleiefirma("Utlån_av_bil",19283746, asFirma);
		opprettAddresser();
		opprettKontorer();
		leggInnKontorer();
		opprettBiler();
		leggTilBiler();
		
		
		
		res = new Reservasjon(uk);
		
		
		
		kunde = new Kunde("Maria","Tufteland",asKunde,98765432);
		
		
	}
	
	
	public void leggInnReservasjon() {
		System.out.println("Velkommen til Bilutleiefirmaet Utlån_av_bil");
		
		
	}

	private void opprettAddresser() {
		as = new Addresse("123P", 2319,"Bergen");
		as1 = new Addresse("234", 2610,"Førde");
		as2 = new Addresse("456", 6781, "Stavanger");
		asFirma = new Addresse("345",2517,"Bergen");
		asKunde = new Addresse("234", 2610,"Førde");
	}
	
	
	
	private void opprettKontorer() {
		uk = new Utleiekontor(as,1,12345678);
		uk1 = new Utleiekontor(as1,2,23456789);
		uk2 = new Utleiekontor(as2, 3, 45678912);
	
	
	}
	
	
	private void leggInnKontorer() {
		bFirma.leggKontorTilIListe(uk);
		bFirma.leggKontorTilIListe(uk1);
		bFirma.leggKontorTilIListe(uk2);
	}
	

	private void opprettBiler() {

		bil = new Bil("BT.45678", "BMW" , "Stasjonsvogn", farge.SVART, gruppe.B, true, 1900);
		bil1 = new Bil("SV.56780","Ford", "Cabriolet",  farge.RØD, gruppe.A, true,19000);
		bil2 = new Bil("TV.9876", "Mercedes", "Stasjonsvogn",farge.BLÅ, gruppe.C,true ,0);
		bil3 = new Bil("TV.5679", "Volksvagen", "Cabriolet", farge.HVIT, gruppe.D, true,0);
		
		
		
		bil4 = new Bil("TV.5673", "Ford", "Stasjonsvogn", farge.BLÅ,gruppe.A, true,0);
		bil5 = new Bil("SV.3412", "Mercedes", "Pickup", farge.RØD, gruppe.D, true,0);
		bil6 = new Bil("TV.9812", "BMW", "Stasjonsvogn", farge.RØD, gruppe.A, true,0);
		
		
		bil7 = new Bil("SV.3526", "Ford", "Stasjonsvogn", farge.HVIT,gruppe.A, true,0);
		bil8 = new Bil("TV.19238", "Mercedes", "Stasjonsvogn", farge.BLÅ, gruppe.A, true,0);
	}
	
	private void leggTilBiler () {
		
		uk.leggTilEnBil(bil);
		uk.leggTilEnBil(bil1);
		uk.leggTilEnBil(bil2);
		uk.leggTilEnBil(bil3);
		
		
		uk1.leggTilEnBil(bil4);
		uk1.leggTilEnBil(bil5);
		uk1.leggTilEnBil(bil6);
		
	
		uk2.leggTilEnBil(bil7);
		uk2.leggTilEnBil(bil8);
	
	}
	
	
	

}
