package no.hvl.dat109.stigespill;

/**
 * Definerer en spiller.
 * 
 * @author Lillian
 *
 */
public class Spiller {

	private Brikke brikke;
	private String navn;
	private boolean vunnet = false;
	private boolean erStraffet = false;

	public Spiller(String navn, Brikke brikke) {
		this.brikke = brikke;
		this.navn = navn;
	}

	/**
	 * spiller en runde for spilleren
	 * 
	 * @param terning
	 */
	public void spillRunde(Terning terning) {
		int antallKast = 0;
		boolean gyldigTur = true;
		int verdi;

		// spilleren erStraffet dersom han triller 6 tre ganger p� rad; m� trille 6 for
		// � f� lov til � starte igjen.
		if (erStraffet) {
			verdi = terning.trill();
			System.out.println();
			System.out.println(navn + " trilte " + verdi + ". ");
			if (verdi == 6) {
				erStraffet = false;
				brikke.flytt(verdi);
			}
		}

		while (gyldigTur && !erStraffet) {
			verdi = terning.trill();
			System.out.println();
			System.out.print(navn + " trilte " + verdi + ". ");

			if (verdi == 6) {
				antallKast++;

				if (antallKast == 3) {
					System.out.println(navn + " trilte 6 tre ganger, og m� derfor flytte tilbake til rute 1.");
					brikke.straffeFlytt();
					erStraffet = true;
					break;
				} else {
					System.out.println(navn + " f�r et ekstra kast.");
				}

			} else {
				gyldigTur = false;
			}

			brikke.flytt(verdi);

			if (harVunnet() == true) {
				gyldigTur = false;
				System.out.println("HURRA! " + navn + " har vunnet!");
			}

		}

	}

	public String getNavn() {
		return navn;
	}

	/**
	 * skjekker om brikken har n�dd rute 100
	 */
	public boolean harVunnet() {
		if (brikke.getPosisjon().getRuteVerdi() == 100) {
			vunnet = true;
		}
		return vunnet;
	}
}
