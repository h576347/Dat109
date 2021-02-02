package no.hvl.dat109;

public class Addresse {

	private String gateaddresse;
	private int postNr;
	private String poststed;
	
	public Addresse(String gateaddresse, int postNr, String poststed) {
		
		this.gateaddresse = gateaddresse;
		this.postNr = postNr;
		this.poststed = poststed;
	}

	public String getGateaddresse() {
		return gateaddresse;
	}

	public void setGateaddresse(String gateaddresse) {
		this.gateaddresse = gateaddresse;
	}

	public int getPostNr() {
		return postNr;
	}

	public void setPostNr(int postNr) {
		this.postNr = postNr;
	}

	public String getPoststed() {
		return poststed;
	}

	public void setPoststed(String poststed) {
		this.poststed = poststed;
	}
	
	
	
	
}
