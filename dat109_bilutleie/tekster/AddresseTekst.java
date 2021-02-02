package no.hvl.dat109.tekster;

import java.util.Scanner;

import no.hvl.dat109.Addresse;

public class AddresseTekst {
	
	
	public Addresse addresseTekst() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn gateaddresse: ");
		String g_Addresse = sc.nextLine();
		
		System.out.println("Skriv inn postnummer: ");
		int pNr = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Skriv inn poststed: ");
		String poststed = sc.nextLine();
		
		sc.close();
		
		return new Addresse(g_Addresse,pNr,poststed);
	}

}
