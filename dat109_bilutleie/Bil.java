package no.hvl.dat109;

public class Bil {
	private String regNr;
	private String merke;
	private String bilmodell;
	private Farge farge;
	private Gruppe utleiegruppe;
	private boolean tilgjengelig;
	private int km;
	

	public Bil(String regNr, String merke, String bilmodell, Farge farge, Gruppe utleiegruppe, boolean tilgjengelig, int km) {
		this.regNr = regNr;
		this.merke = merke;
		this.bilmodell = bilmodell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.tilgjengelig = tilgjengelig;
		this.km = km;

	}

	public String getRegNr() {
		return regNr;
	}

	public void setRegNr(String regNr) {
		this.regNr = regNr;
	}


	public String getBilmodell() {
		return bilmodell;
	}

	public void setBilmodell(String bilmodell) {
		this.bilmodell = bilmodell;
	}


	public boolean isTilgjengelig() {
		return tilgjengelig;
	}

	public void setTilgjengelig(boolean tilgjengelig) {
		this.tilgjengelig = tilgjengelig;
	}


	public String getMerke() {
		return merke;
	}


	public Farge getFarge() {
		return farge;
	}


	public Gruppe getUtleiegruppe() {
		return utleiegruppe;
	}

	
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	
	
	
	
}
