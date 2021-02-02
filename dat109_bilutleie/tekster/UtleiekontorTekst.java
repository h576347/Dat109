package no.hvl.dat109.tekster;

import java.util.Scanner;

import no.hvl.dat109.Addresse;
import no.hvl.dat109.Utleiekontor;

public class UtleiekontorTekst {
	
	
	private Addresse addresse;
	private AddresseTekst at;

	
	public Utleiekontor nyttUtleiekontor() {
		
		Scanner tast = new Scanner(System.in);
		
		addresse = at.addresseTekst();
		
		System.out.println("Skriv inn kontornummer: ");
		int kontornr = tast.nextInt();
		tast.nextLine();
		
		System.out.println("Skriv inn telefonnummer: ");
		int tlf = tast.nextInt();
		tast.nextLine();
				
		
		tast.close();
		
		return new Utleiekontor(addresse, kontornr,tlf);
		
		
	}

}
