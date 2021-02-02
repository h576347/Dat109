package no.hvl.dat109.stigespill.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import no.hvl.dat109.stigespill.Brett;
import no.hvl.dat109.stigespill.Rute;

/**
 * 
 * @author Lillian
 *
 */
public class BrettTest {

	private Brett brett = new Brett();
	private Rute rute15 = brett.getRuteFraBrett(15);
	private Rute rute20 = brett.getRuteFraBrett(20);
	private Rute rute36 = brett.getRuteFraBrett(36);
	private Rute rute44 = brett.getRuteFraBrett(44);
	private Rute rute97 = brett.getRuteFraBrett(97);

	/**
	 * tester at det blir hentet riktig rute ved terningkast
	 */
	@Test
	void hentNyPosisjonTest() {
		Rute testSvar = brett.hentNyPosisjon(rute15, 5);
		assertEquals(testSvar, rute20);
	}

	/**
	 * tester at ny rute ikke blir hentet dersom verdien blir over 100
	 */
	@Test
	void hentNyPosisjonVerdiOver100() {
		Rute testSvar2 = brett.hentNyPosisjon(rute97, 5);
		assertEquals(testSvar2, rute97);
	}

	/**
	 * tester at en rute som er en stige/slange gir tilbake den nye ruten brikken
	 * skal flytte til
	 */
	@Test
	void skjekkRuteTestFinnes() {
		Rute testFinnes = brett.skjekkRute(rute36);
		assertEquals(testFinnes, rute44);
	}

	/**
	 * tester at en rute som ikke er en stige/slange gir tilbake sin egen rute
	 */
	@Test
	void skjekkRuteTestFinnesIkke() {
		Rute testFinnesIkke = brett.skjekkRute(rute20);
		assertEquals(testFinnesIkke, rute20);
	}

}
