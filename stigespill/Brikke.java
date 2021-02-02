package no.hvl.dat109.stigespill;

/**
 * Definerer en brikke.
 * 
 * @author Lillian
 *
 */

public class Brikke {

	private Rute rute;
	private Brett brett;

	public Brikke(Brett brett) {
		this.brett = brett;
		rute = brett.startPosisjon();
	}

	/**
	 * flytter brikken antall terningverdi
	 * 
	 * @param terningverdi
	 */
	public void flytt(int terningverdi) {
		rute = brett.hentNyPosisjon(rute, terningverdi);
		System.out.println("Brikken flyttes til rute " + getPosisjon().getRuteVerdi() + ".");

		// gjør handling dersom nyRute er en slange/stige
		Rute nyRute = brett.skjekkRute(rute);
		if (!rute.equals(nyRute)) {

			System.out.print("Brikken kom på en ");
			if (rute.getRuteVerdi() < nyRute.getRuteVerdi()) {
				System.out.print("stige;");
			} else {
				System.out.print("slange;");
			}
			System.out.println(" brikken flyttes til rute " + nyRute.getRuteVerdi() + ".");

			stigeFlytt(nyRute);
		}
	}

	/**
	 * flytter brikken videre dersom ruten den landet på var en stige/slange
	 * 
	 * @param nyRute
	 */
	private void stigeFlytt(Rute nyRute) {
		rute = nyRute;
	}

	public Rute getPosisjon() {
		return rute;
	}

	/**
	 * flytter brikken tilbake til start
	 */
	public void straffeFlytt() {
		rute = brett.startPosisjon();
	}

}
