package no.hvl.dat109;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import no.hvl.dat109.tekster.ReservasjonsTekst;
import no.hvl.dat109.tekster.KundeTekst;

public class Utleiekontor {
	private Addresse addresse;
	private int kontornr;
	private int telefon;
	private List<Bil> bilListe;
	private List<Reservasjon> reservasjoner;
	private int antBiler;
	
	private ReservasjonsTekst rsTekst;
	private KundeTekst kTekst;
	
	private HashMap<Gruppe,Integer> katPris;

	
	public Utleiekontor(Addresse addresse, int kontornr, int telefon) {
		this.addresse = addresse;
		this.kontornr = kontornr;
		this.telefon = telefon;
		this.bilListe = new ArrayList<Bil>();
		this.reservasjoner = new ArrayList<Reservasjon>();
//		this.rsTekst = new ReservasjonsTekst();
		this.kTekst = new KundeTekst();
		this.katPris = new HashMap<Gruppe,Integer>();
		antBiler = 0;
	}

	
	public void leggTilEnBil(Bil bil) {
		bilListe.add(bil);
		antBiler++;
	}
	
	
	public int utleiePris(Gruppe gruppe) {
		kategori_priser();
		return katPris.get(gruppe);
		
	}

	private void kategori_priser() {
		katPris.put(Gruppe.A, 25000);
		katPris.put(Gruppe.B, 35000);
		katPris.put(Gruppe.C, 45000);
		katPris.put(Gruppe.C, 55000);
		katPris.put(Gruppe.D, 65000);
		
	}
	

	public HashMap<Gruppe, Integer> getKatPris() {
		return katPris;
	}


	public void setKatPris(HashMap<Gruppe, Integer> katPris) {
		this.katPris = katPris;
	}


	public boolean ledigBil(Bil bil) {
		return bil.isTilgjengelig();
		
	}
	
	public Reservasjon opprettRes() {
		Reservasjon res = rsTekst.resTekst();
		
		leggTilResIListe(res);
		return res;
	}
	
	public Kunde nyKunde() {
		Kunde kunde = kTekst.nyKundeTekst();
		return kunde;
	}
	
	public Reservasjon leggTilResIListe(Reservasjon res) {
		reservasjoner.add(res);
		return res;
	}
		
	
	public List<Bil> tilgjengeligeBiler(){
		List<Bil> tBiler = null;
		
		for(Bil biler : bilListe) {
			if(biler.isTilgjengelig()) {
				tBiler.add(biler);
			}
			
		}
		return tBiler;
		
	}
	
	public Addresse getAddresse() {
		return addresse;
	}


	public int getKontornr() {
		return kontornr;
	}


	public int getTelefon() {
		return telefon;
	}



	public List<Bil> getBilListe() {
		return bilListe;
	}



	public List<Reservasjon> getReservasjoner() {
		return reservasjoner;
	}


	
	public int getAntBiler() {
		return antBiler;
	}

	
}
