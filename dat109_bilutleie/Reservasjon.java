package no.hvl.dat109;

import java.util.Date;
import java.util.HashMap;

public class Reservasjon {
	
	private Utleiekontor utleiested,retursted;
	private Date ut_dato,inn_dato;
	private String klokkeslett;
	private int antDager;
	private Gruppe kategori;
	private Kunde kunde;
	private Bil bil;
	
	
	
	public Reservasjon(Utleiekontor utleiested) {
		this.utleiested = utleiested;
		
	}
	

	public Utleiekontor getUtleiested() {
		return utleiested;
	}

	public void setUtleiested(Utleiekontor utleiested) {
		this.utleiested = utleiested;
	}

	public Utleiekontor getRetursted() {
		return retursted;
	}

	public void setRetursted(Utleiekontor retursted) {
		this.retursted = retursted;
	}

	public Date getUt_dato() {
		return ut_dato;
	}

	public void setUt_dato(Date ut_dato) {
		this.ut_dato = ut_dato;
	}

	public Date getInn_dato() {
		return inn_dato;
	}

	public void setInn_dato(Date inn_dato) {
		this.inn_dato = inn_dato;
	}

	public String getKlokkeslett() {
		return klokkeslett;
	}

	public void setKlokkeslett(String klokkeslett) {
		this.klokkeslett = klokkeslett;
	}

	public int getAntDager() {
		return antDager;
	}

	public void setAntDager(int antDager) {
		this.antDager = antDager;
	}


	public Gruppe getKategori() {
		return kategori;
	}




	
	
	
	
	
	
	

}
