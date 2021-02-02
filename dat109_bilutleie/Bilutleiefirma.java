package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.tekster.UtleiekontorTekst;

public class Bilutleiefirma {
	
	private String navn;
	private int telefonnummer;
	private Addresse firmaAdr;
	private List<Utleiekontor> utleiekontor;
	private UtleiekontorTekst ut;
	private int antKontorer;
	
	
	public Bilutleiefirma(String navn, int telefonnummer, Addresse firmaAdr) {
		this.navn = navn;
		this.telefonnummer = telefonnummer;
		this.firmaAdr = firmaAdr;
		this.utleiekontor = new ArrayList<Utleiekontor>();
		antKontorer = 0;
	}



	public Utleiekontor opprettNyttKontor() {
		Utleiekontor nyKontor = ut.nyttUtleiekontor();
		leggKontorTilIListe(nyKontor);
		return nyKontor;
	}
	
	public void leggKontorTilIListe(Utleiekontor nyKontor) {
		antKontorer++;
		utleiekontor.add(nyKontor);
	}

	public List<Utleiekontor> getUtleiekontor() {
		return utleiekontor;
	}



//	public void setUtleiekontor(List<Utleiekontor> utleiekontor) {
//		this.utleiekontor = utleiekontor;
//	}



	public int getAntKontorer() {
		return antKontorer;
	}
	
	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public int getTelefonnummer() {
		return telefonnummer;
	}


	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}


	public Addresse getFirmaAdr() {
		return firmaAdr;
	}


	public void setFirmaAdr(Addresse firmaAdr) {
		this.firmaAdr = firmaAdr;
	}



	

}
