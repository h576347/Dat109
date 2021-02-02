package no.hvl.dat109.tekster;

import java.util.Scanner;

import no.hvl.dat109.Addresse;
import no.hvl.dat109.Kunde;


public class KundeTekst {
	
	private Addresse addresse;
	private AddresseTekst at;
	
	public Kunde nyKundeTekst() {
		at = new AddresseTekst();
		Scanner tast = new Scanner(System.in);
		
		System.out.println("Skriv inn fornavn: ");
		String fNavn = tast.nextLine();
		
		System.out.println("Skriv inn etternavn: ");
		String eNavn = tast.nextLine();
		
		addresse = at.addresseTekst();
		
		System.out.println("Skriv inn telefonnummer: ");
		int tlf = tast.nextInt();
		tast.nextLine();
		
		
		return new Kunde(fNavn,eNavn,addresse,tlf);
		
	}
	

}
