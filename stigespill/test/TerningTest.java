package no.hvl.dat109.stigespill.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import no.hvl.dat109.stigespill.Terning;

/**
 * 
 * @author Lillian
 *
 */
public class TerningTest {

	private Terning terning = new Terning();

	private boolean erRiktigVerdi(int verdi) {

		return verdi >= 1 && verdi <= 6;
	}

	/**
	 * test for å se at terningen genererer et tilfeldig tall fra og med 1 til og
	 * med 6.
	 */
	@Test
	void terningVerdiTest() {
		int verdi;
		for (int i = 0; i < 100; i++) {
			verdi = terning.trill();
			assertTrue(erRiktigVerdi(verdi));
		}

	}
}
