package no.hvl.dat109.stigespill;

/**
 * Definerer en terning
 * 
 * @author Lillian
 *
 */

public class Terning {

	private int verdi;

	/**
	 * Triller terningen.
	 * 
	 * @return
	 */
	public int trill() {

		// random tall [1, 6]
		verdi = 1 + (int) (Math.random() * ((6 - 1) + 1));

		return verdi;
	}

}
