package no.hvl.dat109.stigespill.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import no.hvl.dat109.stigespill.Brett;
import no.hvl.dat109.stigespill.Brikke;
import no.hvl.dat109.stigespill.Rute;

/**
 * 
 * @author Lillian
 *
 */
public class BrikkeTest {

	private Brett brett = new Brett();
	private Brikke brikke = new Brikke(brett);
	private Rute rute1 = brett.getRuteFraBrett(1);
	private Rute rute5 = brett.getRuteFraBrett(5);
	private Rute rute14 = brett.getRuteFraBrett(14);

	/**
	 * tester at brikken blir flyttet til riktig rute, hvor ny rute ikke er en
	 * stige/slange
	 */
	@Test
	void flyttBrikkeUtenStige() {
		brikke.flytt(4);
		assertEquals(brikke.getPosisjon(), rute5);
	}
	
	
	/**
	 * tester at brikken blir flyttet tilbake til startruten
	 */
	@Test
	void straffeFlytt() {
		brikke.straffeFlytt();
		assertEquals(brikke.getPosisjon(), rute1);
	}

	/**
	 * tester at brikken blir flyttet til riktig rute, hvor ny rute er en
	 * stige/slange
	 */
	@Test
	void flyttBrikkeMedStige() {
		brikke.flytt(3);
		assertEquals(brikke.getPosisjon(), rute14);
	}

}
