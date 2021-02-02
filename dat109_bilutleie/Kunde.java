package no.hvl.dat109;

public class Kunde {
	
	private String fornavn;
	private String etternavn;
	private Addresse addresse;
	private int telefonnummer;
	
	
	public Kunde(String fornavn, String etternavn, Addresse addresse, int telefonnummer) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.addresse = addresse;
		this.telefonnummer = telefonnummer;
	}


	public String getFornavn() {
		return fornavn;
	}


	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}


	public String getEtternavn() {
		return etternavn;
	}


	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}


	public Addresse getAddresse() {
		return addresse;
	}


	public void setAddresse(Addresse addresse) {
		this.addresse = addresse;
	}


	public int getTelefonnummer() {
		return telefonnummer;
	}


	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	
	
	
}
